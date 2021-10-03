package com.example.postAPI;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
@RestController
@RequestMapping("/services")
@SpringBootApplication
public class XmltojavatestApplication {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\marwa\\Desktop\\postAPI\\src\\main\\resources\\smple.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(CustomerDetailedInquiry.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			CustomerDetailedInquiry sampleObject = (CustomerDetailedInquiry) jaxbUnmarshaller.unmarshal(file);
			class APIcontroller {

				@PostMapping("/consumption_summary")
				public @ResponseBody
				ResponseEntity<Object> post(){
					return new ResponseEntity<Object>(sampleObject, HttpStatus.OK);

				}

			}
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}



}
