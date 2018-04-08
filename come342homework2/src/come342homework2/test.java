package come342homework2;

public class test {

	public static void main(String[] args) {
		   client client = new client();
		   client.assignClient("Pepsi", "Tekfen Tower Büyükdere Cad. No:209, 34394, 4. Levent – Istanbul", "pepsi@pepsiCo.com", "Levent Yüksel", "yuksel@pepsiCo.com");
		   client.getCompanyName();
		   client.getCompanyAddress();
		   client.getCompanyEmail();
		   client.getContactName();
		   client.getContactEmail();
		   System.out.println(client.getCompanyName());
		   System.out.println(client.getCompanyAddress());
		   System.out.println(client.getCompanyEmail());
		   System.out.println(client.getContactName());
		   System.out.println(client.getContactEmail());

	}

}
