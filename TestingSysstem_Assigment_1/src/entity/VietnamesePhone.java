package entity;

public class VietnamesePhone extends Phone{

	@Override
	public void insertContact(String name, String phone) {
		String[] contacts = {name,phone};
		this.setContacts(contacts);
		
	}

	@Override
	public void removeContact(String name) {
		if(this.getContacts()[0] == name) {
			this.setContacts(null);
		}else System.out.println("không có contact có tên này: " + name);
	}

	@Override
	public void updateContact(String name,String newphone) {
		if(this.getContacts()[0] == name) {
			String[] updateContacts = {name,newphone};
			this.setContacts(updateContacts);
		}else System.out.println("Không có Contact có tên này: "+name);
	}

	@Override
	public void searchContact(String name) {
		// TODO Auto-generated method stub
		if(this.getContacts()[0] == name) {
			System.out.println("name: "+this.getContacts()[0]+"\nPhone: "+this.getContacts()[1]);
		}
	}

	@Override
	public String toString() {
		return "VietnamesePhone ["+ this.getContacts() +"]";
	}
	

}
