package com.shop.shop.controller;

import com.shop.shop.dto.ItemFormDto;
import com.shop.shop.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping("/admin/item/new")
    public String itemForm(Model model){
        model.addAttribute("itemFormDto", new ItemFormDto());
        return "/item/itemForm";
    }

    @PostMapping("/admin/item/new")
    public String itemNew(@Valid ItemFormDto itemFormDto, BindingResult bindingResult,
                          Model model, @RequestParam("itemImgFile") List<MultipartFile> itemImagFileList){

        if(bindingResult.hasErrors()){
            return "item/itemForm";
        }

        if(itemImagFileList.get(0).isEmpty() && itemFormDto.getId() == null){
            model.addAttribute("errorMessage", "첫번째 상품 이미지 반드시 입력");
            return "item/itemForm";
        }

        try {
            itemService.saveItem(itemFormDto, itemImagFileList);
        }catch (Exception e){
            model.addAttribute("errorMessage", "상품 등록 중 에러");
            return "item/itemForm";
        }

        return "redirect:/";
    }

    @GetMapping("/admin/item/{itemId}")
    public String itemDtl(@PathVariable("itemId") Long itemId, Model model){

        try {
            ItemFormDto itemFormDto = itemService.getItemDtl(itemId);
            model.addAttribute("itemFormDto", itemFormDto);
        }catch (EntityNotFoundException e){
            model.addAttribute("errorMessage", "존재하지 않는 상품 입니다.");
            model.addAttribute("itemFormDto", new ItemFormDto());
            return "item/itemForm";
        }

        return "item/itemForm";

    }

    @PostMapping("/admin/item/{itemId}")
    public String itemUpdate(@Valid ItemFormDto itemFormDto,
              BindingResult bindingResult,
              @RequestParam("itemImgFile") List<MultipartFile> itemImagFileList,
              Model model){
        if(bindingResult.hasErrors()){
            return "item/itemForm";
        }

        if(itemImagFileList.get(0).isEmpty() && itemFormDto.getId() == null){
            model.addAttribute("errorMessage", "첫번째 상품 이미지 반드시 입력");
            return "item/itemForm";
        }

        try {
            itemService.updateItem(itemFormDto, itemImagFileList);
        }catch (Exception e){
            model.addAttribute("errorMessage", "상품 수정 중에 에러 발생");
            return "item/itemForm";
        }

        return "redirect:/";
    }


}
