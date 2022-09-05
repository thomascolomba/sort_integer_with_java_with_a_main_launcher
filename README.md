# sort\_integer\_with_java with main launcher

Just a main method that calls sort\_integer\_with_java to execute it


-- pom.xml <br/>
dependency : sort\_integer\_with_java<br/>

<br/>
-- MainSort.java<br/>
public static void main(String[] args) {<br/>
&nbsp;&nbsp;&nbsp;&nbsp;int[] myInts = {5,4,6};<br/>
&nbsp;&nbsp;&nbsp;&nbsp;SortIntegers.sort(myInts);<br/>
&nbsp;&nbsp;&nbsp;&nbsp;syso(myInts);//4,5,6<br/>
	