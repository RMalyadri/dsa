package com.design;

public class UrlShorner {

	public static void main(String[] args) {
		int n = 12345;
		String shorturl = idToShortURL(n);
		System.out.println("Generated short url is " + shorturl);
	}

	static String idToShortURL(int n) {
		// Map to store 62 possible characters
		char map[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

		StringBuffer shorturl = new StringBuffer();

		// Convert given integer id to a base 62 number
		while (n > 0) {
			// use above map to store actual character
			// in short url
			shorturl.append(map[n % 62]);
			n = n / 62;
		}

		// Reverse shortURL to complete base conversion
		return shorturl.reverse().toString();
	}

}
