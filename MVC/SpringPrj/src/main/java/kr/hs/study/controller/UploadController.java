package kr.hs.study.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UploadController {
	
	@Autowired
	@Qualifier("uploadPath") // 실제 업로드될 폴더
	private String uploadPath;
	
	//파일 업로드 폼 출력되게 매핑
	@GetMapping("/upload")
	public String upload_form() {
		return "upload/upload_form";
	}
	
	@PostMapping("/re_upload")
	public ModelAndView re_upload(MultipartFile file, ModelAndView mv) throws IOException {
		System.out.println("filename : " + file.getOriginalFilename());
		System.out.println("filesize : " + file.getSize());
		System.out.println("filetype : " + file.getContentType());
		System.out.println("filename2 : " + file.getName());
		
		String savedname = file.getOriginalFilename();
		File a = new File(uploadPath, savedname);
		
		FileCopyUtils.copy(file.getBytes(), a);
		mv.setViewName("upload/uploadResult");
		mv.addObject("savedname", savedname);
		
		return mv;
	}
}
