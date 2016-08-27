package in.co.employeeaction;

import in.DTO.EmployeeDTO;
import EmployeeService.EmployeeService;

import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction extends ActionSupport {
	private String operation;
	private int id;
	private String city;
	private String name;
	private String state;

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String input() throws Exception {
		// TODO Auto-generated method stub
		return INPUT;
	}

	public String execute() {
		EmployeeDTO dto = new EmployeeDTO();
		EmployeeService service = new EmployeeService();//if we take static  in service

		if ("Add".equalsIgnoreCase(operation)) {
			dto.setId(id);
			dto.setName(name);
			dto.setCity(city);
			dto.setState(state);
			//id = service.add(dto);
			//EmployeeService.add(dto);// if we take static method in service
			service.add(dto);
			//addActionMessage("your data is successfuly added");

		}
		if ("Update".equalsIgnoreCase(operation)) {
			dto.setId(id);
			dto.setName(name);
			dto.setCity(city);
			dto.setState(state);
			service.update(dto);
			addActionMessage("data updated");
		}
		if ("Delete".equalsIgnoreCase(operation)) {
			dto.setId(id);
			service.delete(dto);
			addActionMessage("data deleted");

		}
		if ("Get".equalsIgnoreCase(operation)) {
			dto.setId(id);
			service.get(id);
			addActionMessage("data goted");
		}
		return SUCCESS;

	}
}
