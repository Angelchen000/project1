
public class POJO
	{
		private	String name;
		private	String JuiceContain;
		private String Price;
		
		public POJO (String n, String b, String a) {
			name = n;
			JuiceContain = b;
			Price = a;
		
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public String getJuiceContain()
			{
				return JuiceContain;
			}

		public void setJuiceContain(String juiceContain)
			{
				JuiceContain = juiceContain;
			}

		public String getPrice()
			{
				return Price;
			}

		public void setPrice(String price)
			{
				Price = price;
			}

	}
