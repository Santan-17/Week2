package NewPrograms;


	class Author{
		String name;
		String emailid;
		char gender;
		Author(String name, String emailid, char gender){
			
			this.name= name;
			this.emailid=emailid;
			this.gender=gender;
			
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmailid() {
			return emailid;
		}
		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}
		public char getGender() {
			return gender;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}
		
		
	}

	class Book{
		String name;
		double price;
		int quantity;
	     Author author;
		
		public Book(String name, int  price, int quantity, Author author) {
			super();
			this.name = name;
			this.price =  price;
			this.quantity = quantity;
			this.author = author;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		
		
		public Author getAuthor() {
			return author;
		}
		public void setAuthor(Author author) {
			this.author = author;
		}
		public void displayauthorDetails(){
			 System.out.println("Author details"+author);
		 }
		
		
	}
	public class AggregationEx {
		
		public static void main(String[] args) {
			
			
			Author k1 = new Author("Joshua Bloch","joshua@email.com",'M');
			Book b = new Book("Effective java",15,45,k1);
			System.out.println("Displaying author details");
			System.out.println(" Author name : "+k1.getName());
			System.out.println(" Author Email id :"+k1.getEmailid());
			System.out.println(" Author gender : "+k1.getGender());
			
			
		}


	}

