package kosta.controller;

import java.io.File;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import kosta.model.Board;
import kosta.model.BoardDao;

@Controller
public class BoardController {
	@Autowired
	private BoardDao dao;
	
	private String uploadDir = "D:/upload";
	
	//@RequestMapping(value = "/board_insert", method = RequestMethod.GET)
	@GetMapping("/board_insert")
	public String board_form(@ModelAttribute("boardCommand") Board board) {
		return "insert_form";
	}
	
	//@RequestMapping(value = "/board_insert", method = RequestMethod.POST)
	@PostMapping("/board_insert")
	public String board_insert(@ModelAttribute("boardCommand") @Valid Board board, BindingResult errors) {
		if(errors.hasErrors()) {
			System.out.println("에러발생");
			return "insert_form";
		}
		
		board.setFname("");
		MultipartFile multipartFile = board.getUploadFile();
		
		if(multipartFile.getOriginalFilename() != null) {
			String fname = multipartFile.getOriginalFilename();
			board.setFname(fname);
			
			try {
				multipartFile.transferTo(new File(uploadDir, fname));//파일 업로드 실행
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		dao.insert(board);
		
		return "redirect:board_list";
	}
	
	@GetMapping("/board_list")
	public String board_list(Model model) {
		model.addAttribute("list", dao.listBoard());
		return "list";
	}
	
	@GetMapping("/board_detail{seq}")
	public String board_detail(@PathVariable int seq, Model model) {
		model.addAttribute("board", dao.detailBoard(seq));
		
		return "detail"; 
	}
	
	@GetMapping("/board_download")
	public String board_download(@RequestParam("filename") String filename,
															Model model)throws Exception {
		File file = new File(uploadDir, filename);
		model.addAttribute("downloadFile", file);
		
		return "downloadView";
	}

}









