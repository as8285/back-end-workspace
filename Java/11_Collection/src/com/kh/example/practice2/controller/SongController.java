package com.kh.example.practice2.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.example.practice2.compare.ArtisDescending;
import com.kh.example.practice2.compare.TitleAscending;
import com.kh.example.practice2.model.Song;

public class SongController {
	
	private 	ArrayList<Song> list = new ArrayList<>();
	// 싱글톤 패턴(Singleton Pattern)
	// - 디자인 패턴 중 하나로 클래스가 최대 한번만 객체 생성되도록 하는 패턴 
	// 생성자는 private 
	private SongController() {
		
	}
	//2. 유일한 객체를 담을 static 변수 
	private static SongController instance;
	
	//3. 객체를 반환하는 정적 메서드 
	public static SongController getInstance() {
		if(instance == null) instance = new SongController();
		return instance;
	}
	
	public boolean addLastList(Song song) {
		if(!song.getTitle().equals("") &&!song.getArtist().equals("")) {
		return list.add(song);
	}return false;
}
	public boolean addFirstList(Song song) {
		if(!song.getTitle().equals("") &&!song.getArtist().equals("")) {	
		list.add(0,song);
		return true;
	}
		return false;
	}
public ArrayList<Song> printAll( ) {
	for(Song song : list) {
		System.out.println(song);
	}
	return list;
}

public Song searchSong(String title) {
	for (Song song : list) {
		if (song.getTitle().contains(title)) {
			return song;
		}
	}
	return null;
}

public Song removeSong(String title) {	
	for (Song song : list) {

	if (song.getTitle().equals(title)) {
	
		
		return list.remove(list.indexOf(song));
	}
	}
return null;

}

public Song updateSong(String search, Song update) {

	for (Song song : list) {
		if (song.getTitle().equals(search)) {

			return list.set(list.indexOf(song), update);

		}
	}
	return null;
}
public ArrayList<Song> acsTitle() {
	
	ArrayList<Song> clonelist = (ArrayList<Song>) list.clone();
	Collections.sort(clonelist, new TitleAscending());
	return clonelist;
}

public ArrayList<Song> descArtist() {
	ArrayList<Song> clonelist = (ArrayList<Song>) list.clone();
	Collections.sort(clonelist, new ArtisDescending());
	return clonelist;
}

}

