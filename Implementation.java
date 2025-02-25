// Extended Euclidean Algorithm
public static Result eea(int n, int k){

  if(k==0){
	  return new Result(1, 0, n);
  }

  Result res = eea(k, n%k);

  return new Result(res.y, res.x-res.y*(n/k), res.t);
}

// Helpter function for the Extended Euclidean Algorithm (returns 0 if there is no valid inverse key)
static int inverseKey(int mod, int key){
  Result result = eea(mod, key);

  int resultKey = result.y;
  int greatestCommonDivisor = result.t;

  if(resultKey < 0){
    resultKey += mod;
  }

  if(greatestCommonDivisor != 1){
  	resultKey = 0;
  }

  return resultKey;
}






// Where "Result" is the helper class:
public class Result {
	public int x;
	public int y;
	public int t;
	
	Result(int x, int y, int t){
		this.x = x;
		this.y = y;
		this.t = t;
	}
}






// simple test program:
int mod = 152;
int key = 33;
int inverseKey = inverseKey(mod, key);
		
System.out.println("\ntest:\n" + "key = " + key + "   inverseKey = " + inverseKey + "   mod = " + mod); // key = 33   inverseKey = 129   mod = 152
System.out.println("(key * inverseKey) % mod = " + mod(key*inverseKey,mod)); // (key * inverseKey) % mod = 1
