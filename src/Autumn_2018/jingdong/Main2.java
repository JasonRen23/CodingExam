package Autumn_2018.jingdong;

import java.util.Scanner;
/**
 * 
 * @author Administrator
 * 作者：牛妹
链接：https://www.nowcoder.com/discuss/38889
来源：牛客网

求幂
分析

裸暴力好像只能拿20%的分

我们考虑去枚举n范围内的所有i,然后处理出i的幂那些数。
考虑对于i ^ x, 我们需要计算满足 (i ^ x) ^ c = (i ^ y) ^ d的数量,其中i ^ x, i ^ y <= n. 这些我们可以通过预处理出来。
然后对于(i ^ x) ^ c = (i ^ y) ^ d 其实意味着x c = y d, 意味着(x / y) = (d / c), 其中x, y我们可以在预处理之后枚举出来,于是我们就可以借此计算出n范围内有多少不同这种c和d去满足等式。
其实就等于 n / max(x / gcd(x, y), y / gcd(x, y)),然后都累加进答案。gcd()表示最大公约数。
中间可能产生重复枚举,我们用一个set或者hash容器标记一下就好。

以上枚举对于2~sqrt(n)。最后对于大于sqrt(n)的部分,每个的贡献都是n。
 *
 */
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		String str = in.nextLine();
		char[] c = str.toCharArray();
		System.out.println(solves(str));//solve(c, 0, str.length()-1)-1
		
	}
	static boolean match(String[] s,int l,int r)  //匹配括号
	{
	    if(s[l]=="(" && s[r]==")")
	        return true;
	    return false;
	}
	static int dfs(String[] s,int[][] dp,int l,int r)
	{
	    if(dp[l][r] >= 0) return dp[l][r];
	    int ans=dp[l][r]=0;
	    if(l>r) return ans=1;
	    if(l==r) return ans=1;
	    ans=dfs(s,dp,l+1,r);   //删除括号
	   
	    for(int i=l;i<=r;i++){   //枚举配对
	        if(match(s,l,i)){
	            ans+=dfs(s,dp,l+1,i-1)*dfs(s,dp,i+1,r);
	            
	        }
	    }
	    return ans;
	}
	static int solve(char[] s,int i,int j)  
	{  
	    int[][] dp = new int[305][305];
	    for(int ii = 0; ii < dp.length; ++ii){
	    	for(int jj = 0; jj < dp[0].length; ++jj){
	    		dp[i][j] = -1;
	    	}
	    }
		if(dp[i][j]>=0)  
	        return dp[i][j];  
	    if(i>=j)  
	        return 1;  
	    int res=solve(s,i+1,j);  
	    char aim='0';  
	    if(s[i]=='(')  
	        aim=')';  
	    
	    if(aim!='0')  
	    {  
	        for(int q=i+1;q<=j;q++)  
	        {  
	            if(s[q]==aim)  
	                res=res+solve(s,i+1,q-1)*solve(s,q+1,j);
	            res = res % 1000000007;
	        }    
	    }  
	    dp[i][j]=res;  
	    return res % 1000000007;  
	}

	static int solves(String str){
		int left = 0;
		int sum = 1;
		for(int i = 0; i < str.length(); ++i){
			if(str.charAt(i) == '('){
				left++;
			}
			else{
				sum *= left;
				left--;
			}
			
		
		}

	return sum;
}

}

