package edu.sbcc.cs105;public class ObfuscatedHelloWorld {public String pǝʇɐɔsnɟqo(String hex)
{StringBuilder sb = new StringBuilder();StringBuilder temp = new StringBuilder();
for( int i=0; i<hex.length()-1; i+=2 ){String output = hex.substring(i, (i + 2));int decimal =
Integer.parseInt(output, 16);sb.append((char)decimal);temp.append(decimal);}return sb.toString();
}public static void main(String[] args){ObfuscatedHelloWorld strToHex = new ObfuscatedHelloWorld();
String hex = "48656c6c6f20576f726c6421";System.out.println(strToHex.pǝʇɐɔsnɟqo(hex));}}