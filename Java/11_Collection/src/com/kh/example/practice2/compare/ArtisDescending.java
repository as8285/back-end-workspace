package com.kh.example.practice2.compare;

import java.util.Comparator;

import com.kh.example.practice2.model.Song;

public class ArtisDescending implements Comparator<Song>{

	@Override
	public int compare(Song o1, Song o2) {
		return o1.getArtist().compareTo(o2.getArtist());
	}

}
