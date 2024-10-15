package kosta.video;

import java.util.ArrayList;
import java.util.List;

public class GeneralMember {
	private String id;
	private String name;
	private String address;
	//private Video rentalVideo;
	private List<Video> rentalVideo;
	
	public GeneralMember() {}

	public GeneralMember(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		rentalVideo = new ArrayList<Video>();
	}
	
	public void rental(Video video) {
		rentalVideo.add(video);
	}
	
	public void show() {
		System.out.println("회원 아이디: " + id);
		System.out.println("회원 이름: " + name);
		System.out.println("회원 주소: " + address);
		//rentalVideo.show();
		for(Video v : rentalVideo) {
			v.show();
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Video> getRentalVideo() {
		return rentalVideo;
	}

	public void setRentalVideo(List<Video> rentalVideo) {
		this.rentalVideo = rentalVideo;
	}

	
	
	
}
