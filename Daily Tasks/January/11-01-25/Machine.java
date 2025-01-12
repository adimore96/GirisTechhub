class Machine{
	private int id, machineNo, machineCapacity;
	private String name,fuleType;
	
	//setter methods
	public void setId(int id){
		this.id =id;
	}
	public void setMachineNo(int machineNo){
		this.machineNo = machineNo;
	}
	public void setMachineCapacity(int machineCapacity){
		this.machineCapacity = machineCapacity;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setFuelType(String fuleType){
		this.fuleType = fuleType;
	}
	
	
	//getter methods
	public int getId(){
		return id;
	}
	public int getMachineNo(){
		return machineNo;
	}
	public int getMachineCapacity(){
		return machineCapacity;
	}
	public String getName(){
		return name;
	}
	public String getFuleType(){
		return fuleType;
	}
}