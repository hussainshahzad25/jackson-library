package javaproject;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class M3 {
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
//		JacksonTester tester = new JacksonTester();

		try {
			ObjectMapper mapper = new ObjectMapper();

			Map<String, Object> studentDataMap = new HashMap<String, Object>();
			int[] marks = { 1, 2, 3 };

			Student student = new Student();

			student.setAge(10);
			student.setName("Mahesh");

			// JAVA Object
			studentDataMap.put("student", student);

			// JAVA String
			studentDataMap.put("name", "Mahesh Kumar");

			// JAVA Boolean
			studentDataMap.put("verified", Boolean.FALSE);

			// Array
			studentDataMap.put("marks", marks);

			mapper.writeValue(new File("student.json"), studentDataMap);

			studentDataMap = mapper.readValue(new File("student.json"), Map.class);

			System.out.println(studentDataMap.get("student"));
			System.out.println(studentDataMap.get("name"));
			System.out.println(studentDataMap.get("verified"));
			System.out.println(studentDataMap.get("marks"));
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}