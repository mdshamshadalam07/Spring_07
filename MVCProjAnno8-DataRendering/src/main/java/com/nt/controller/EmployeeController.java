package com.nt.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.dto.EmployeeDTO;

@Controller
public class EmployeeController {
	@RequestMapping("/list")
	public String  listData(Map<String,Object> map) {
		map.put("name","Shamshad");
		map.put("age",25);
		// collections
		List<String> fruitsList=List.of("Apple","banana","Orange","mango");  // 9 ver
		Set<Long> phoneSet=Set.of(9162139958L,7004841326L,8409895604L,8538901862L);
		Map<String,Integer> subjectMarksMap=Map.of("Physics",99,"Chemistry",98,"Mathematic",97,"Urdu",96);
		String favColors[]=new String[] {"Red","Green","Blue","Pink"};
		map.put("fruitsList", fruitsList);
		map.put("phoneSet", phoneSet);
		map.put("subjectMarksMap",subjectMarksMap);
		map.put("favColors",favColors);
		
		EmployeeDTO dto = new EmployeeDTO(101,"Khan","Arwal",1000.0f); 
		map.put("empData",dto);
		// collections
		List<EmployeeDTO> listDTO = List.of (new EmployeeDTO(201,"Sunny","Walidad",2000.0f),
				                                                         new EmployeeDTO(202,"Shahbaj","Arwal",6000.0f),
						                                                 new EmployeeDTO(203,"Salman","Mumbai",4000.0f),
								                                         new EmployeeDTO(204,"Mumtaj","Ranchi",3000.0f)
								                                       );
       map.put("empList",listDTO);
		return "show";
	}
}