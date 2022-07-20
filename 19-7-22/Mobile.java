class Mobile
{
	String Mobilemodel;
	String MobileCompany;
	Double MobilePrice;
	public void Addmobile(String Mmodel,String Mcompany,double Mprice)
	{
		Mobilemodel=Mmodel;
		MobileCompany=Mcompany;
		MobilePrice=Mprice;
		System.out.println(Mmodel+" "+Mcompany+" price is "+Mprice);
	}
	public void MdisplayMobile()
	{
	System.out.println(Mobilemodel+" "+MobileCompany+" price is "+MobilePrice);
	}
}
