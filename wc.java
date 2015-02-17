public class WC{
	public static int getWordCount(String text){
		text = text.replaceAll("\r\n"," ");
		System.out.println("\n"+text);
		return text.split(" ").length;
	}

	public static int getLineCount(String text){
		return text.split("\r\n").length-1;
	}

	public static int[] evaluate(String text){
		int counts[] = {getLineCount(text),getWordCount(text),text.length()};
		Help.printArray(counts);
		return counts;
	}
}

class Help{
	public static void printArray(int[] array){
		for(int i=0 ; i<array.length ; i++){
			System.out.print(" "+array[i]+" ");
		}
	}
}