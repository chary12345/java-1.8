package com.multithread;

public class CharAsci {

	public static void main(String[] args) {
		char celebrate[] = new char[] { 72, 105, 14, 69, 118, 101, 114, 121, 111, 110, 101, 33, 32, 73, 32, 114, 101,
				97, 99, 104, 101, 100, 32, 116, 111, 32, 112, 108, 97, 116, 105, 110, 117, 109, 32, 115, 116, 97, 116,
				117, 115, 32, 121, 101, 115, 116, 101, 114, 100, 97, 121, 32, 117, 115, 105, 110, 103, 32, 34, 67, 34,
				32, 80, 114, 111, 103, 114, 97, 109, 109, 105, 110, 103, 32, 83, 111, 32, 73, 32, 119, 111, 117, 108,
				100, 32, 108, 105, 107, 101, 32, 116, 111, 32, 115, 97, 121, 32, 34, 84, 104, 97, 110, 107, 115, 34, 32,
				116, 111, 32, 116, 104, 101, 109, 10, 10, 64, 76, 73, 79, 78, 10, 64, 86, 97, 118, 97, 100, 105, 121,
				97, 10, 64, 65, 116, 108, 97, 115, 10, 64, 86, 73, 86, 69, 75, 10, 64, 65, 75, 82, 10, 64, 82, 65, 74,
				69, 83, 87, 65, 82, 73, 10, 64, 72, 97, 114, 115, 104, 10, 64, 65, 98, 104, 105, 10, 10, 42, 42, 42, 42,
				42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42,
				42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 10, 10, 73, 32, 103, 111, 116, 32, 115, 111, 109, 101, 32, 102,
				114, 105, 101, 110, 100, 115, 32, 104, 101, 114, 101, 46, 32, 76, 101, 116, 32, 109, 101, 32, 109, 101,
				110, 116, 105, 111, 110, 32, 116, 104, 101, 109, 10, 10, 64, 68, 97, 110, 105, 101, 108, 32, 124, 32,
				79, 114, 97, 110, 103, 101, 32, 124, 10, 64, 65, 117, 100, 117, 32, 40, 65, 108, 105, 101, 110, 32, 41,
				10, 64, 77, 111, 101, 32, 84, 104, 97, 101, 10, 64, 65, 97, 121, 117, 115, 104, 105, 10, 64, 89, 105,
				110, 32, 77, 105, 110, 110, 32, 65, 121, 101, 10, 64, 86, 105, 114, 103, 105, 101, 32, 82, 111, 115,
				101, 10, 10, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43,
				43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 43, 10, 10, 73, 32, 119, 97, 110, 116,
				116, 101, 100, 32, 116, 111, 32, 98, 101, 32, 97, 32, 103, 111, 111, 100, 32, 34, 69, 110, 103, 105,
				110, 101, 101, 114, 34, 32, 105, 110, 32, 102, 117, 116, 117, 114, 101, 46, 32, 84, 104, 101, 114, 101,
				32, 105, 115, 32, 97, 32, 114, 101, 97, 115, 111, 110, 32, 119, 104, 121, 32, 100, 105, 100, 32, 73, 32,
				99, 111, 100, 101, 32, 116, 104, 105, 115, 32, 98, 121, 32, 34, 65, 83, 67, 73, 73, 34, 32, 110, 117,
				109, 98, 101, 114, 115, 46, 32, 84, 104, 97, 116, 32, 105, 115, 32, 98, 101, 99, 97, 117, 115, 101, 32,
				73, 32, 97, 109, 32, 108, 101, 97, 114, 110, 105, 110, 103, 32, 97, 98, 111, 117, 116, 32, 100, 105,
				103, 105, 116, 97, 108, 32, 101, 108, 101, 99, 116, 114, 111, 110, 105, 99, 32, 97, 110, 100, 32, 110,
				101, 116, 119, 111, 114, 107, 105, 110, 103, 46, 10, 10, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36,
				36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 33, 33, 33, 84, 72, 73, 72, 65, 33, 33,
				33 };
		for (char t : celebrate) {
			System.out.print(t);
		}
		;
	}
}