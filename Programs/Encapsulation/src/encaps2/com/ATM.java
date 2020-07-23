package encaps2.com;

public class ATM
{
   private String name="SBI";
   private Integer password=1234;
   private Integer CVV=654;
}

  class Yourfriend extends ATM
{
         String Name;
         Integer psw;
         Integer cvv;
        
 
        
        public Yourfriend(String name, Integer psw, Integer cvv) {
			super();
			Name = name;
			this.psw = psw;
			this.cvv = cvv;
		}



		void disp()
        {
                System.out.println(this.psw);
                System.out.println(this.cvv);
        }
}