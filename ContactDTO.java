package model;

public class ContactDTO {
	
	private String contact_name;
	private String contact_mail;
	private String contact_subject;
	private String contact_message;
	
	public ContactDTO() {
		
	}

	public String getContact_name() {
		return contact_name;
	}

	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}

	public String getContact_mail() {
		return contact_mail;
	}

	public void setContact_mail(String contact_mail) {
		this.contact_mail = contact_mail;
	}

	public String getContact_subject() {
		return contact_subject;
	}

	public void setContact_subject(String contact_subject) {
		this.contact_subject = contact_subject;
	}

	public String getContact_message() {
		return contact_message;
	}

	public void setContact_message(String contact_message) {
		this.contact_message = contact_message;
	}
	
	

}
