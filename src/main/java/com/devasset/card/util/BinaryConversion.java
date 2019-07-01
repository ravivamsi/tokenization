/**
 * 
 */
package com.devasset.card.util;

/**
 * @author vamsir
 *
 */
public class BinaryConversion {

	public static String integerToBinary(Integer integer) {

		return Integer.toBinaryString(integer);

	}

	public static Integer binaryToInteger(String binary) {

		return Integer.parseInt(binary, 2);

	}

	public static String swapBinariesOddOddEvenEven(String binaries) {

		return binaries.substring(4, 7) + binaries.substring(12, 15) + binaries.substring(0, 3)
				+ binaries.substring(8, 11);

	}

	public static String swapBinariesEvenEvenOddOdd(String binaries) {

		return binaries.substring(0, 3) + binaries.substring(8, 11) + binaries.substring(4, 7)
				+ binaries.substring(12, 15);

	}

	public static String swapBinaryReserse(String binary) {

		return binary.substring(4, 7) + binary.substring(0, 3);

	}

}
