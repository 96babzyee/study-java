public class Song {
	private String []title;
	private String artist;
	private int year;
	private String country;
	
	public Song() {}
	
	public Song(String []title, String artist, int year, String country) {
		
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	void show() {
		System.out.print(year + "년 ");
		System.out.print(country + "국적의 ");
		System.out.print(artist + "가 부른 ");
		System.out.print(title);
		
		for(int i=0;i<title.length;++i)
			System.out.println(title[i]);
	}
	
}
