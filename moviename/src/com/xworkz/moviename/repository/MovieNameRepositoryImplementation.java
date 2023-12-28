package com.xworkz.moviename.repository;

public class MovieNameRepositoryImplementation implements MovieNameRepository{

	
	private String[] movie=new String[4];
	private int index=0;
	@Override
	public boolean onSave(String moviename) {
		if(movie==null||index>=movie.length) {
			System.out.println("array is full");
		}else {
			if(index<movie.length) {
				movie[index]=moviename;
				index++;
				return true;
			}
		}
		
		return false;
	}

	@Override
	public String[] read() {
		// TODO Auto-generated method stub
		return movie;
	}

}
