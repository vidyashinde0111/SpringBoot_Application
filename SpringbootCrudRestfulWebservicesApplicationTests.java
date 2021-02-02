package com.springboot.crudrestfulwebservices;
import static org.mockito.Mockito.when;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.http.client.methods.RequestBuilder;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.springboot.controller.EmployeeController;
import com.springboot.exception.ResourceNotFoundException;
import com.springboot.model.Employee;
import com.springboot.repository.EmployeeRepository;
import com.springboot.service.EmployeeService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
@RunWith(SpringRunner.class)
@WebMvcTest(value=EmployeeController.class)
//@SpringBootTest
public class SpringbootCrudRestfulWebservicesApplicationTests {
	@Autowired
	MockMvc mockMvc;
	@MockBean
	private EmployeeRepository employeeRepository;
	@Test
	public void getAllEmployeeTest() throws Exception
	{
	when(employeeRepository.findAll()).thenReturn(Collections.emptyList());
	MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders.get("/api/v1").accept(MediaType.APPLICATION_JSON)).andReturn();
	System.out.println(mvcResult.getResponse());
	//Mockito.verify(employeeRepository).findAll();
	}
	/*
	@Test
	public void getEmployeeByIdTest() throws ResourceNotFoundException 
	{
		Employee emp= new Employee();
		emp.setId(1);
		Mockito.when(employeeRepository.findById(emp.getId())).thenReturn(emp);
		mockMvc.perform(null)
		<Employee> employee=employeeController.getEmployeeById(1L);
		Long id=(long) 1;
		assertEquals(1, EmployeeRepository.getEmployeeById(id));
	}
	public void getEmployeeByIdTest(Long id) 
	{
		Optional<Employee> emp =Optional.of(new Employee(1," vidya","shinde", "vidya@gmail.com"));
		when(employeeRepository.findById(id)).thenReturn(emp);
		//MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders.get("/employees").accept(MediaType.APPLICATION_JSON)).andReturn(emp);

	}
	
	@Test
	public void createEmployeeTest() throws Exception
	{
		
		Employee emp= new Employee();
		emp.setId(1);
		emp.setFirstName("vidya");
		emp.setLastName("shinde");
		emp.setEmailId("vidya@gmail.com");
		String inputInJson=this.mapToJson(emp);
		//mockMvc.perform(post("/api/v1/employees").contentType(MediaType.APPLICATION_JSON).content(toJson(emp))).andExpect(status().isOk());
		Mockito.when(EmployeeService..save(Mockito.anyString(),Mockito.any(Employee.class))).thenReturn(emp);
		RequestBuilder requestBuilder=MockMvcRequestBuilders.post("/api/v1/employees").accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON);
		MvcResult result=mockMvc.perform(requestBuilder).andReturn();
	
	}
	
	{
		Employee employee = new Employee(3,"sanika","rathod", "sanika@gmail.com");
		//when(repository.save(employee)).thenReturn(employee);
		assertEquals(employee, service.addEmployee(employee));
	}

	@Test
	public void getAllEmployeesTest()
	{
		when(repository.findAll()).thenReturn(Stream.of(new Employee(1,"vidya","shinde","vidya@gmail.com")).collect(Collectors.toList()));
		assertEquals(1, service.getEmployees());
	}

	@Test
	public void getEmployeeByIdTest() throws ResourceNotFoundException 
	{
		EmployeeController employeeController=new EmployeeController();
		ResponseEntity<Employee> employee=employeeController.getEmployeeById(1L);
		Long id=(long) 1;
		assertEquals(1, service.getEmployeeById(id));
	}
	@Test
	public void deleteEmployeeByIdTest()
	{
		Employee employee = new Employee(2,"sanika","rathod", "sanika@gmail.com");
		Long id=(long) 1;
		repository.deleteById(id);
		verify(repository,times(1)).delete(employee);

*/
}
