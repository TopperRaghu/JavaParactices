package JavaBasic;

public class incredecreandfinallyStatic {

	public static void main(String[] args) {
		//post increment
		int a=1;
		int b=a++;
		
		System.out.println(a);
		System.out.println(b);//assign first then increment
		int l= 3;
		int m= l++;
		System.out.println(l);//4
		System.out.println(m);//3
		
		int p =-98;
		int q =p++;
		
		System.out.println(p);//-97=-98+1
		System.out.println(q);//-98
		
		//pre increment
		
		int u= 1;
		int y= ++u;
		System.out.println(u);
		System.out.println(y);//increase first then assign the value
		
		int x=5;
		int z=++x;
		System.out.println(x);
		System.out.println(z);
		
		int v=-99;
		int vv=++v;
		System.out.println(v);
		System.out.println(vv);
		
		int pop=2;
		System.out.println(pop++);
		System.out.println(pop);
		System.out.println(++pop);
		
		int loop=2;
		System.out.println(++loop);
		System.out.println(loop);
		
		int ammount=10;
		int finalammount= ammount+1;
		
		System.out.println(finalammount);
		
		
		//post decrement
		int tt= 2;
		int pp= tt--;
		System.out.println(tt);//1
		System.out.println(pp);//2
		
		int rest = -99;
		int api  =rest--;
		System.out.println(rest);//-100
		System.out.println(api);//-99
		
		//pre decrement
		
		int aa=2;
		int bb=--a;
		System.out.println(aa);
		System.out.println(bb);
		
		int s1=-1000;
		int s2=--s1;
		System.out.println(s1);
		System.out.println(s2);
		
		int s3= 40;
		System.out.println(s3--); //println will consume the current value of s3
		System.out.println(s3);
		
		
		int p3 =50;
		System.out.println(--p3);//first we decrement the p3 and then consume p3 current value
		System.out.println(p3);
		
		int na= 2;
		//int test =na++ + na++ + na++ + na++;
		int test1=na-- +na++ + --na + ++na;//na=2
		
		//test1=2+1+1+2
		System.out.println(test1);
		System.out.println(na);
		
		
				
		
		
		
		
		
		
		
		
	}

}
