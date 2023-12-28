package com.xworkz.product.abstractimplementation;


import com.xworkz.product.dto.Passportdto;

public class PassportImplimentation extends Passportdto {
	
	
	

	Object[] obj =new Object[4];
	int index =0;
	public void onsave(Passportdto passportdto) {
		long a=passportdto.getContactNumber();
		int count=0;
		while(a>0) {
			count++;
			a=a/10;
			
		}
		if(count==10) {
			if(index<obj.length) {
				obj[index]= passportdto;
				index++;
				
				
			}
		}else {
			System.out.println("not equal to 10");
		}
			
		}
		
		public void read() {
			for(Object object:obj) {
				System.out.println(object);
	}
		}
		
		public void searchByCurrentAddress(String CurrentAddress) {
			for(int i=0;i<obj.length;i++) {
				if(obj!=null) {
					Passportdto p=(Passportdto)obj[i];
					if(p.getCurrentAddress().equalsIgnoreCase(CurrentAddress)) {
						System.out.println(obj[i]);
						break;
						
					}
				}
				if(i==obj.length-1) {
					System.out.println("CurrentAddress is not present in the array");
				}
			}
		}
		public void searchBycontactNumber(int contactNumber) {
			for (int i=0;i<obj.length;i++) {
				if (obj!=null) {
					Passportdto p=(Passportdto)obj[i];
					if(p.getContactNumber()==contactNumber) {
						System.out.println(obj[i]);
						break;
					}
				}
				if(i==obj.length-1) {
					System.out.println("contactNumber is not present in the array");
				}
				
			}
		}
		public void deleteByApplicationId(int ApplicationId) {
			for (int i=0;i<obj.length;i++) {
				Passportdto p=(Passportdto)obj[i];
				if(p!=null) {
					if(p.getApplicationId()==ApplicationId) {
						obj[i]=null;
						for(int j=1;j<obj.length-1;j++) {
							obj[j]=obj[j+1];
						}
						obj[obj.length-1]=null;
						index=index-1;
						break;
					}
				}
				if(i==obj.length-1) {
					System.out.println("data with ApplicationId "+ApplicationId+" is not present ");
				}
			}
		}
		public void updateByApplicationId(int ApplicationId,Object obj) {
			for (int i=0;i<this.obj.length;i++) {
				if(obj!=null) {
			
				Passportdto p=(Passportdto)this.obj[i];
				
					if(p.getApplicationId()==ApplicationId) {
						this.obj[i]=null;
		
	}
		
}
			}
		}
}