import java.math.*;
import java.util.*;
/*Integer},to
 * calculate solutions to a range of generalized problems involving modular
 * arithmetic,and concerning with large numbers,for example,such as the n'th
 * fibonacci number mod m,where n and m are large, Binomial Coefficients mod
 * p,where p is a prime number,the Jacobi symbol (n p) calculator,modular square
 * roots in prime fields,modular exponentation of complex numbers, the highest
 * power of a prime p,that divides into the prime factorization of n factorial,
 * and much more.{@code this} class extends java.math.BigInteger, albeit with
 * more advanced algorithms to solve generalized higher Mathematics and of some
 * importance in computer science,for without {@code this} class to provide the
 * much needed methods,the programmer will have to write their own
 * functions , which may be time consuming,as well as inefficient in some cases.
 * 
 * <p>
 * Many of the methods in {@code this} class are not primitive operations found
 * anywhere else in java libraries,including BigInteger.Rather,most of them are
 * complex Mathematical algorithms,optimized to the maximum possible,to achieve
 * the best possible time,and are designed to serve a certain problen in higher
 * Mathematics.For example,the "modularSquareRoot" method provides an efficient
 * function to calculate modular square roots in prime number fields,which are
 * vital in Cryptography and Acoustics Engineering,while the "modularSolve"
 * method,provides an algorithm implementation especially important in Data
 * Security and Cryptography, equivalent to the Chinese Remainder Theorem.
 * Others,such as the "nCrModP" method is of importance in combinatronics,where
 * the number of combinations have to be found of objects.Others ,like the
 * Lucas-Lehmer sequence are used for the efficient primality testing of
 * Mersenne Numbers,of a special form.
 * 
 * <p>
 * Modular Arithmetic provides an efficient way to handle large numbers,while
 * saving time and memory.For example,a million factorial has about five and a
 * half million digits,which would be extremely tedious and impractical to work
 * with,taking up a a large amount of place,and posiibly time.On the other hand
 * ,finding the remainder modulo 107 for example,would be easy,and would save a
 * great deal of time and space.These are some of the kinds of problems for
 * which algorithms are provided. Many of the algorithms,especially the ones
 * involving factorials however ,use the modulus as a prime number.Prime numbers
 * are very easy to work with in modular arithmetic due to them having no
 * smaller factors,other than one,and many modular algorithms only work for
 * prime numbers.
 * 
 *
 * 
 * <p>
 * In terms of efficiency,a great deal of these algorithms have rather efficient
 * time complexities of O(log n) or O(log(n)^2),like the modularSquareRoot
 * method,but some may have a time of O(n) or O(n log n),like the nCrModP.For
 * these such times,only values of int are used as their inputs,to keep the
 * efficiency.Keep in mind that these methods utilize some of the most efficient
 * practical algorithms,but for some cases,even these may not run very fast,like
 * involving factorials.
 * 
 * <p>
 * In {@code this} class,you may see that some of the methods are listed with
 * return type BigInteger, or input of BigInteger,rather than BigNumber,
 * according to their Javadoc.They will work perfectly with BigNumber,except for
 * the static BigInteger methods and also return a result of type
 * BigNumber,since they are overriden.{@code this} feature enables all the
 * Overriden methods to return BigNumber, for further operations on them,and the
 * saving of time to repeatedly convert from BigInteger to BigNumber and Vice
 * Versa.
 */
/**
 * A class containing algorithms.The {@code BigNumber} class extends the
 * {@code BigInteger} class, and contains advanced algorithms to efficiently
 * solve multiple problems in Number theory, Combinatronics, acoustics,
 * cryptography, and miscellaneous subjects.It has the same functions of
 * {@code BigInteger}, but will Override them,instead always returning a
 * {@code BigNumber},to ensure compatibility, and to make it easier for the
 * programmers utilizing this class, rather then them converting to
 * {@code BigNumber} every time they use the methods.
 * 
 * <p>
 * The main goal of this class is to provide algorithms to calculate various
 * problems pertaining to Number Theory,Combinatronics,Complex Numbers,and
 * Modular Arithmetic.Many of the modular arithmetic algorithms use Prime
 * Numbers.The reason is because of an Identity called Fermat's Little Theorem.
 * If P is a prime Number,and A is a Positive number, less than P ,then it
 * states that A<sup>P</sup>=A mod(P),where "mod" is the modulus operator.If B
 * is a positive number,then A mod (B) is the remainder upon dividing A by B.
 * 
 * <p>
 * The reason that Modular Arithmetic was chosen to be implemented is because it
 * provides an efficient way to handle large numbers,while saving time and
 * memory.For example,a million factorial has about five and a half million
 * digits,which would be extremely tedious and impractical to work with,taking
 * up a a large amount of place,and possibly time.On the other hand ,finding the
 * remainder modulo 107 for example,would be easy,always result in a number less
 * than 107,and save a lot of space,as long as the operations are performed in
 * the right way.These are some of the kinds of problems for which algorithms
 * are provided.As another example,consider determining solutions to the
 * quadratic modular equation x<sup>2</sup>=a mod(N),where N is a large number
 * (about 300 Digits).A naive method is to check every possible value of x,from
 * 1 to N,and check if it works.However,this is extremely slow.If today, you ran
 * every computer ever built with this method,it will take longer than the age
 * of the universe to achieve.However,if N is prime,then if a<sup>(n-1)/2</sup>
 * mod (N) is -1,then no solution exists,otherwise one does.This approach is
 * efficient, and takes only about 1000 operations for two 300 Digit Numbers,
 * easily feasible for a modern computer today.
 * 
 * <p>
 * A small section of the methods are also dedicated to complex numbers and
 * their operations.The "ComplexExponentation" method,analogous to the
 * {@code BigInteger} modPow method,performs modular exponentation of complex
 * numbers in polynomial time.The "complexAdd" adds 2 complex numbers together.
 * There was no need to add a complex subtract method,since complexAdd does that
 * too.The "complexMultiply" method multiplies complex numbers,and returns a
 * result of type array ,which contains the real and imaginary part of the
 * product. A method for the division of complex numbers was also considered,but
 * rejected since it may result in a return type of {@code double} or
 * {@code float}, which is not intended for the {@code BigNumber} class.
 * 
 * <p>
 * The main purpose of these algorithms is for general uses,which are important
 * for network planning,cryptography,acoustics,and combinatronics. Other
 * miscellaneous operations are included,such as fibonacci numbers,and lucas
 * numbers, just in case they are needed.
 * 
 * <p>
 * Many of the algorithms work reasonably efficient for the size of their
 * inputs,with some having time {@code O(log}<sup>2</sup>{@code (n))} or
 * {@code O(log(n))},but others are inefficient for large inputs,like the ones
 * pertaining to combinatronics,which have a time complexity of {@code O(n)} or
 * {@code O(n log(n)}.These methods have maximum parameters of only type
 * {@code int}, that is 2147483647.
 * 
 * <p>
 * The class {@code BigNumber} is multithreaded, meaning that it extends
 * {@code Thread}, or implements {@code Runnable}, leading to concurrency across
 * multiple cores.This is especially useful in calculating programs involving
 * binomial coefficients and combinatronics, where no efficient method faster
 * than time complexity of O(n) or O(sqrt(n)) is known.
 * 
 * 
 * @author DB
 * @see BigInteger
 * @see SecureRandom
 * @see BigDecimal
 * @see String
 * @see Object
 * @see Number
 * @see Thread
 * @see Runnable
 * @since 13.0.2
 * 
 */

public final class BigNumber extends BigInteger /* implements Runnable */ {

	/**
	 * The serialVersionUID of the {@code BigNumber} class,for interoperability.
	 */
	private static final long serialVersionUID = 1757876336253234117L;
	/**
	 * 
	 */

	/*
	 * Fundamental Numerical integer Constants, from -1 to 10.
	 */

	/** The {@code BigNumber} constant {@code -1}. */
	protected static final BigNumber NEGATIVE_ONE = new BigNumber("-1");
	/** The {@code BigNumber} constant {@code 0}. */
	public static final BigNumber ZERO = new BigNumber("0");
	/** The {@code BigNumber} constant {@code 1}. */
	public static final BigNumber ONE = new BigNumber("1");
	/** The {@code BigNumber} constant {@code 2}. */
	public static final BigNumber TWO = new BigNumber("2");
	/** The {@code BigNumber} constant {@code 3}. */
	public static final BigNumber THREE = new BigNumber("3");
	/** The {@code BigNumber} constant {@code 4}. */
	public static final BigNumber FOUR = new BigNumber("4");
	/** The {@code BigNumber} constant {@code 5}. */
	public static final BigNumber FIVE = new BigNumber("5");
	/** The {@code BigNumber} constant {@code 6}. */
	public static final BigNumber SIX = new BigNumber("6");
	/** The {@code BigNumber} constant {@code 7}. */
	public static final BigNumber SEVEN = new BigNumber("7");
	/** The {@code BigNumber} constant {@code 8}. */
	public static final BigNumber EIGHT = new BigNumber("8");
	/** The {@code BigNumber} constant {@code 9}. */
	public static final BigNumber NINE = new BigNumber("9");
	/** The {@code BigNumber} constant {@code 10}. */
	public static final BigNumber TEN = new BigNumber("10");

	/**
	 * The random number generation threshold.If the bitlength exceeds this
	 * threshold, an {@code ArithmeticException} will be thrown, since it is
	 * infeasible for the machine to generate numbers with a bitlength this large.
	 * 
	 * @see BigInteger.PRIME_SEARCH_BIT_LENGTH_LIMIT
	 */
	static final int RANDOM_NUMBER_THRESHOLD = 500000000;

	/**
	 * The largest possible value of the primitive type {@code int}.
	 */
	static final int INT_MAX_VALUE = 2147483647;
	/**
	 * The largest possible value of the primitive type {@code long}.
	 */
	static final long LONG_MAX_VALUE = 9223372036854775807l;
	/**
	 * The largest possible value of the primitive type {@code short}.
	 */
	static final short SHORT_MAX_VALUE = 32767;
	/**
	 * The largest possible value of the primitive type {@code byte}.
	 */
	static final byte BYTE_MAX_VALUE = 127;

	/**
	 * The vector to hold the BigNumber values for the
	 * {@link BigNumber.continuedFraction(BigNumber a, BigNumber b, BigNumber c)}
	 * method.
	 */
	private static Vector<BigNumber> contFrac = new Vector<BigNumber>();
	/**
	 * The default number of utilized Thread in the functions.
	 */
	private static final int DEFAULT_UTILIZED_THREADS = 1000;
	/**
	 * The amount of Thread utilized in computing the
	 * {@linkplain BigNumber.calculateFactorial(int factorial)} method.
	 */
	private static volatile int utilizedThreads = DEFAULT_UTILIZED_THREADS;

	/**
	 * Two {@code volatile} Arrays containing values to hold in the Multithreaded
	 * functions.
	 */
	private static volatile int[] arr = new int[utilizedThreads];
	private static volatile BigNumber[] arr1 = new BigNumber[utilizedThreads];
	private static BigNumber modulus;
	private static int rem;

	/**
	 * {@code ArrayList}s used in the calculation of the solvability of the discrete
	 * logarithm equation.
	 */

	private static ArrayList<Integer> powers;
	private static ArrayList<BigNumber> factorRes;

	/*
	 * Constructors from the superclass,BigInteger.Then are the Overriden methods
	 * from BigInteger, to ensure efficiency and compatibility.
	 */

	public BigNumber(byte[] val) {
		super(val);
		// TODO Auto-generated constructor stub
	}

	public BigNumber(String val) {
		super(val, 10);
		// TODO Auto-generated constructor stub
	}

	public BigNumber(int signum, byte[] magnitude) {
		super(signum, magnitude);
		// TODO Auto-generated constructor stub
	}

	public BigNumber(String val, int radix) {
		super(val, radix);
		// TODO Auto-generated constructor stub
	}

	public BigNumber(int numBits, Random rnd) {
		super(numBits, rnd);
		// TODO Auto-generated constructor stub
	}

	public BigNumber(byte[] val, int off, int len) {
		super(val, off, len);
		// TODO Auto-generated constructor stub
	}

	public BigNumber(int bitLength, int certainty, Random rnd) {
		super(bitLength, certainty, rnd);
		// TODO Auto-generated constructor stub
	}

	public BigNumber(int signum, byte[] magnitude, int off, int len) {
		super(signum, magnitude, off, len);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigNumber add(BigInteger val) {
		// TODO Auto-generated method stub
		return valueOf(super.add(val));
	}

	@Override
	public BigNumber nextProbablePrime() {
		// TODO Auto-generated method stub
		return valueOf(super.nextProbablePrime());
	}

	@Override
	public BigNumber subtract(BigInteger val) {
		// TODO Auto-generated method stub
		return valueOf(super.subtract(val));
	}

	@Override
	public BigNumber multiply(BigInteger val) {
		// TODO Auto-generated method stub
		return valueOf(super.multiply(val));
	}

	@Override
	public BigNumber divide(BigInteger val) {
		// TODO Auto-generated method stub
		return valueOf(super.divide(val));
	}

	@Override
	public BigNumber[] divideAndRemainder(BigInteger val) {
		// TODO Auto-generated method stub
		BigInteger[] arr0 = super.divideAndRemainder(val);
		BigNumber[] arr = { new BigNumber(arr0[0].toString()), new BigNumber(arr0[1].toString()) };
		return arr;
	}

	@Override
	public BigNumber remainder(BigInteger val) {
		// TODO Auto-generated method stub
		return valueOf(super.remainder(val));
	}

	@Override
	public BigNumber pow(int l) {
		// TODO Auto-generated method stub
		return valueOf(super.pow(l));
	}

	@Override
	public BigNumber sqrt() {
		// TODO Auto-generated method stub
		return valueOf(super.sqrt());
	}

	@Override
	public BigNumber[] sqrtAndRemainder() {
		// TODO Auto-generated method stub
		BigInteger[] arr0 = super.sqrtAndRemainder();
		BigNumber[] arr = { valueOf(arr0[0]), valueOf(arr0[1]) };
		return arr;
	}

	@Override
	public BigNumber gcd(BigInteger val) {
		// TODO Auto-generated method stub
		return valueOf(super.gcd(val));
	}

	@Override
	public BigNumber negate() {
		// TODO Auto-generated method stub
		return valueOf(super.negate());
	}

	@Override
	public int signum() {
		// TODO Auto-generated method stub
		return super.signum();
	}

	@Override
	public BigNumber mod(BigInteger m) {
		// TODO Auto-generated method stub
		return valueOf(super.mod(m));
	}

	@Override
	public BigNumber modPow(BigInteger exponent, BigInteger m) {
		// TODO Auto-generated method stub
		return valueOf(super.modPow(exponent, m));
	}

	@Override
	public BigNumber modInverse(BigInteger m) {
		// TODO Auto-generated method stub
		return valueOf(super.modInverse(m));
	}

	@Override
	public BigNumber shiftLeft(int n) {
		// TODO Auto-generated method stub
		return valueOf(super.shiftLeft(n));
	}

	@Override
	public BigNumber shiftRight(int n) {
		// TODO Auto-generated method stub
		return valueOf(super.shiftRight(n));
	}

	@Override
	public BigNumber or(BigInteger val) {
		// TODO Auto-generated method stub
		return valueOf(super.or(val));
	}

	@Override
	public BigNumber xor(BigInteger val) {
		// TODO Auto-generated method stub
		return valueOf(super.xor(val));
	}

	@Override
	public BigNumber not() {
		// TODO Auto-generated method stub
		return valueOf(super.not());
	}

	@Override
	public BigNumber andNot(BigInteger val) {
		// TODO Auto-generated method stub
		return valueOf(super.andNot(val));
	}

	@Override
	public boolean testBit(int n) {
		// TODO Auto-generated method stub
		return super.testBit(n);
	}

	@Override
	public BigNumber setBit(int n) {
		// TODO Auto-generated method stub
		return valueOf(super.setBit(n));
	}

	@Override
	public BigNumber clearBit(int n) {
		// TODO Auto-generated method stub
		return valueOf(super.clearBit(n));
	}

	@Override
	public BigNumber flipBit(int n) {
		// TODO Auto-generated method stub
		return valueOf(super.flipBit(n));
	}

	@Override
	public int getLowestSetBit() {
		// TODO Auto-generated method stub
		return super.getLowestSetBit();
	}

	@Override
	public int bitLength() {
		// TODO Auto-generated method stub
		return super.bitLength();
	}

	@Override
	public int bitCount() {
		// TODO Auto-generated method stub
		return super.bitCount();
	}

	@Override
	public boolean isProbablePrime(int certainty) {
		// TODO Auto-generated method stub
		if (this.signum() == -1)
			return false;
		return super.isProbablePrime(certainty);
	}

	@Override
	public int compareTo(BigInteger val) {
		// TODO Auto-generated method stub
		return super.compareTo(val);
	}

	@Override
	public boolean equals(Object x) {
		// TODO Auto-generated method stub
		return super.equals(x);
	}

	@Override
	public BigNumber min(BigInteger val) {
		// TODO Auto-generated method stub
		return valueOf(super.min(val));
	}

	@Override
	public BigNumber max(BigInteger val) {
		// TODO Auto-generated method stub
		return valueOf(super.max(val));
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public byte[] toByteArray() {
		// TODO Auto-generated method stub
		return super.toByteArray();
	}

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return super.intValue();
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return super.longValue();
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return super.floatValue();
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return super.doubleValue();
	}

	@Override
	public long longValueExact() {
		// TODO Auto-generated method stub
		return super.longValueExact();
	}

	@Override
	public int intValueExact() {
		// TODO Auto-generated method stub
		return super.intValueExact();
	}

	@Override
	public short shortValueExact() {
		// TODO Auto-generated method stub
		return super.shortValueExact();
	}

	@Override
	public byte byteValueExact() {
		// TODO Auto-generated method stub
		return super.byteValueExact();
	}

	@Override
	public BigNumber and(BigInteger val) {
		// TODO Auto-generated method stub
		return valueOf(super.and(val));
	}

	@Override
	public BigNumber abs() {
		return (this.signum() >= 0 ? this : this.negate());
		// TODO Auto-generated method stub
//		BigNumber a = this;
//		return a.multiply(valueOf(a.signum()));
	}

	/**
	 * Static Class to hold the {@code run} method, for multithreaded functions.
	 * Since the visibility of Runnable cannot be reduced when overriding it, there
	 * is a need to keep it in a static class, to prevent classes from outside this
	 * package from accessing Runnable, which could ponentially be disastrous for
	 * methods contained in this class itself.
	 * 
	 * @author DB
	 *
	 */

	static class MultiThreadedBigumber implements Runnable {
		volatile BigNumber transfer;
		volatile int code;

		public MultiThreadedBigumber(BigNumber t, int code) {
			this.transfer = t;
			this.code = code;
			// TODO Auto-generated constructor stub
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			if (this.code == 1)
				run1();
			Thread.yield();
		}

		public void run1() {
			BigNumber prod = ONE;
			int off = Integer.parseInt(this.transfer.toString());
			for (int i = arr[off]; i < arr[off] + rem; i++)
				prod = (prod.multiply(valueOf(i))).mod(modulus);
			arr1[off] = prod;
		}
	}

	/**
	 * Returns the current number of live threads (daemon and non daemon).
	 * 
	 * @return The number of live threads
	 * @see {@code Thread}
	 */
	public static int getActiveThreads() {
		return ManagementFactory.getThreadMXBean().getThreadCount();
	}

	/**
	 * Sets the amount of new {@code Thread} objects utilized in the computation of
	 * the multithreaded functions. A default value is set at 1000.
	 * 
	 * @param newVal the New value to set the amount of {@code Thread} objects.
	 * @see {@code Thread}S
	 */

	static synchronized void setUtilizedConcurrentThreads(int newVal) {
		if (newVal < 0 || newVal > INT_MAX_VALUE)
			throw new IllegalArgumentException(
					"Cannot set available threads lower than zero, or greater than the largest int value.");
		utilizedThreads = newVal;
	}

	/**
	 * Returns the maximum amount of {@code Thread} objects, set at the maximum
	 * priority, used in any of the functions.
	 * 
	 * @return The maximum amount of threads, set at maximum priority, to be used in
	 *         the multithreaded programs.
	 */
	public static int getUtilizedConcurrentThreads() {
		return utilizedThreads;
	}

	/**
	 * Function to report overflow in the event of the {@code BigNumber} value
	 * becoming too large.
	 */

	private static void reportOverflow() {
		throw new ArithmeticException("BigNumber would overflow supported range");
	}
	/*
	 * Static methods,to convert long,BigInteger, or BigDecimal to BigNumber.
	 */

	/**
	 * Converts the input {@code BigInteger} to a {@code BigNumber}.
	 * 
	 * @param val,The {@code BigInteger} input.
	 * @return The {@code BigNumber} value of the {@code BigInteger}.
	 */
	public static BigNumber valueOf(BigInteger val) {
		return new BigNumber(val.toString());
	}

	/**
	 * Returns the {@code BigNumber} value of the {@code long}.
	 * 
	 * @param val,The {@code long} input.
	 * @return The {@code BigNumber} equivalent of the {@code long} input.
	 *
	 */

	public static BigNumber valueOf(long val) {
		return new BigNumber(String.valueOf(val));
	}

	/**
	 * Converts the {@code this BigNumber} into a {@code BigInteger}
	 * 
	 * @return The {@code BigInteger} value of the {@code BigNumber}
	 * @see java.math.BigInteger
	 */
	public static BigNumber valueOf(BigDecimal val) {
		return new BigNumber(val.toBigIntegerExact().toString());
	}
	/*
	 * Converts the BigNumber to a BigInteger or BigDecimal
	 */

	/**
	 * Converts the {@code this BigNumber} into a {@code BigInteger}
	 * 
	 * @return The {@code BigDecimal} value of the {@code this BigInteger}
	 * @see {@code java.math.BigInteger}
	 */

	public BigInteger toBigInteger() {
		return new BigInteger(this.toString());
	}

	/**
	 * Converts the {@code this BigNumber} into a {@code BigDecimal}
	 * 
	 * @return The {@code BigDecimal} value of the {@code this BigNumber}
	 * @see java.math.BigDecimal
	 */
	public BigDecimal toBigDecimal() {
		return new BigDecimal(this.toString());
	}
	/*
	 * Static methods to generate Random numbers,compatible with Different types of
	 * Random,for different purposes.It is highly Recommended for java.util.Random
	 * to be used for non Cryptographic purposes instead of SecureRandom or
	 * ThreadLocalRandom ,since it is runs quicker.
	 * 
	 */

	/**
	 * Generates a random or Pseudorandom number(depending on the type of
	 * {@code Random}) with the given Bitlength.Is compatible with all types of
	 * {@code Random},e.g {@code SecureRandom},{@code ThreadLocalRandom},and can be
	 * used for cryptographic purposes.
	 * 
	 * @param bitLength,the Bit Length of the desired random number.
	 * @param rand          , the type of Random being used.
	 * @return A random number with the given Bit Length.
	 * @throws ArithmeticException if Bit Length is too large,or not positive.
	 * @see java.util.Random
	 * @see java.security.SecureRandom
	 * @see java.util.concurrent.ThreadLocalRandom
	 * 
	 */

	public static BigNumber randomNumber(int bitLength, Random rand) {
		if (bitLength > RANDOM_NUMBER_THRESHOLD)
			reportOverflow();
		if (Math.signum(bitLength) != 1)
			throw new ArithmeticException("Bit Length not positive");
		return new BigNumber(new BigInteger(bitLength, rand).toString());
	}

	/**
	 * Generates a random probable prime number with the given bitlength.
	 * 
	 * @param bitLength,the length of the random number.
	 * @param rand,the      specified random number generator.
	 * @return a random probable prime with a given bitlength.
	 * @throws ArithmeticException if Bit Length is too large,or not positive.
	 */
	public static BigNumber randomPrime(int bitLength, Random rnd) {
		if (Math.signum(bitLength) != 1)
			throw new ArithmeticException("Bit length must be positive");
		if (bitLength > RANDOM_NUMBER_THRESHOLD)
			reportOverflow();
		return new BigNumber(BigInteger.probablePrime(bitLength, rnd).toString());
	}

	/*
	 * This section contains vaious algorithms,pertaining to modular Arithmetic
	 * ,Binomial coefficients,Prime numbers,etc,which have some importance in
	 * Cryptography,and anything pertaining to Computer science.However,a few of
	 * these methods are also useful in Number theory,Acoustics,and Error Correcting
	 * Code.
	 */
	/**
	 * Calculates {@code factorial!} mod {@code this}. This function is
	 * multithreaded, so that it utilized the full processing capabilities of the
	 * device, useful especially when the time complexity of calculating factorials
	 * or binomial coefficients is {@code O(n)}.
	 * 
	 * @param factorial
	 * @param mod
	 * @return
	 */
	public static synchronized BigNumber calculateFactorial(int factorial, BigNumber mod) {
		if (factorial < 1)
			throw new ArithmeticException("Factorial must be positive");
		if (mod.compareTo(ZERO) != 1)
			throw new ArithmeticException("Modulus must be positive.");
		setUtilizedConcurrentThreads((int) Math.sqrt(factorial) / 10 + 1);
		BigNumber res = mod.calculateFactorial(1, factorial);
		setUtilizedConcurrentThreads(DEFAULT_UTILIZED_THREADS);
		return res;
	}

	BigNumber calculateFactorial(int offset, int factorial) {
		BigNumber mod = this;
		modulus = mod;
		rem = factorial / utilizedThreads;
		BigNumber product = ONE;
		if (valueOf(factorial).compareTo(modulus) != -1)
			return ZERO;
		if (!modulus.isProbablePrime(10) && valueOf(factorial).compareTo(modulus.sqrt()) != -1)
			return ZERO;
		for (int i = 2; i < 1000; i++)
			if (modulus.mod(valueOf(i)).equals(ZERO))
				if (factorial > i)
					return ZERO;
		int res = factorial - factorial % utilizedThreads;
		for (int i = factorial; i > res; i--)
			product = (product.multiply(valueOf(i)).mod(modulus));
		if (res == 0)
			return product;
		arr[0] = offset;
		for (int i = 1; i < utilizedThreads; i++)
			arr[i] = arr[i - 1] + rem;
		for (int i = 0; i < utilizedThreads; i++) {
			Thread t = new Thread(new BigNumber(String.valueOf(i)).toMultiThreadedBigumber(1));
			t.setPriority(Thread.MAX_PRIORITY);
			t.run();
		}
		for (int i = 0; i < utilizedThreads; i++) {
			BigNumber mult = arr1[i];
			if (mult.equals(ZERO))
				return ZERO;
			product = (product.multiply(mult)).mod(modulus);
		}
		arr = null;
		arr1 = null;
		modulus = null;
		return product;
	}

	private MultiThreadedBigumber toMultiThreadedBigumber(int code) {
		return new MultiThreadedBigumber(this, code);
	}

	/**
	 * Calculates the number of permutations given N Objects and R
	 * 
	 * @param n
	 * @param r
	 * @param mod
	 * @return
	 */

	public static synchronized BigNumber nPrModN(int n, int r, BigNumber mod) {
		if (mod.signum() != 1)
			throw new ArithmeticException("Modulus must be positive.");
		if (n >= r)
			throw new ArithmeticException("N must be greater than R");
		if (Math.signum(n) != 1 || Math.signum(r) != 1)
			throw new ArithmeticException("N and R must both be positive");
		BigNumber.setUtilizedConcurrentThreads((int) Math.sqrt(n - r) / 10 + 1);
		BigNumber res = mod.calculateFactorial(r, n);
		BigNumber.setUtilizedConcurrentThreads(DEFAULT_UTILIZED_THREADS);
		return res;
	}

	/**
	 * Returns the value of the Binomial Coefficient (n r),which is equal to
	 * n!/(r!(n-r)!),where x! is x(x-1)(x-2)...(1).In other words,it returns the
	 * number on the n'th row,and the r'th diagonal of Pascal's Triangle.
	 * 
	 * @param n,the row on Pascal's Triangle.
	 * @param r,the diagonal on Pascal'a Triangle.
	 * @return The Binomial Coefficient (n r).
	 * @throws ArithmeticException if n,r are more than the constant MAX_VALUE.
	 * @throws ArithmeticException is n or r are not positive.
	 * @throws ArithmeticException is n is less than r.
	 */
	public BigNumber nCr(int n, int r) {
		if (n >= INT_MAX_VALUE || r >= INT_MAX_VALUE)
			throw new ArithmeticException("Parameters must be less than " + INT_MAX_VALUE);
		if (n < 1 || r < 1)
			throw new ArithmeticException("Parameters must be positive");
		if (n < r)
			throw new ArithmeticException("Row must be greater than diagonal");
		if (n == r)
			return ONE;
		if (r > n / 2)
			r = (n - r);
		long n1 = n;
		long r1 = r;
		BigNumber prod1 = ONE;
		BigNumber prod2 = ONE;
		BigNumber g;
		do {
			prod1 = prod1.multiply(new BigNumber(String.valueOf(n1)));
			prod2 = prod2.multiply(new BigNumber(String.valueOf(n1)));
			g = prod1.gcd(prod2);
			if (g.equals(prod2)) {
				prod1 = (prod1.divide(g));
				prod2 = ONE;
			} else {
				prod1 = prod1.divide(g);
				prod2 = prod2.divide(g);
			}
			n1--;
			r1--;
		} while (r1 > 0);
		return prod1;
	}

	/**
	 * Returns the value of the binomial coefficient (n r) modulo p, where p is
	 * prime number.Has a time complexity of O(p log n),the reason why p is only of
	 * type int.The binomial coefficient (n r) is equal to (n!)/((r!)(n-r)!),where
	 * x! is equal to x(x-1)(x-2)......(3)(2)(1).
	 * 
	 * @param n
	 * @param r
	 * @param p,the modulus,which must be prime.
	 * @return the value of the binomial coefficient (n r) modulo p.
	 * @throws ArithmeticException if p is too large,out of Integer.MAX_VALUE.
	 * @throws ArithmeticException if p is not prime
	 * @throws ArithmeticException if n,r,or p is not positive.
	 */
	public static BigNumber nCrModPrime(BigNumber n, BigNumber r, int p) {
		if (n.signum() != 1 || r.signum() != 1 || Math.signum(p) != 1)
			throw new ArithmeticException("All parameters must be positive");
		if (valueOf(p).compareTo(valueOf(INT_MAX_VALUE)) == 1)
			throw new ArithmeticException("Modulus is too large");
		if (!(valueOf(p).isProbablePrime(10)))
			throw new ArithmeticException("Modulus is not prime");
		return nCrModP(n, r, valueOf(p));
	}

	private static long nCrModpDP(long n, long r, long p) {
		if (n == 0 || r == 0)
			return 1;
		if (n < r)
			return 0;
		if (n == r)
			return 1;
		long prod0 = 1;
		long prod1 = 1;
		long nr = n - r;
		long max = Math.max(r, nr);
		for (long a = n; a > max; a = a - 1)
			prod0 = (prod0 * a) % (p);
		for (long b = Math.min(r, nr); b > 0; b = b - 1)
			prod1 = (prod1 * b) % p;
		long res = (prod0 * (valueOf(prod1).modInverse(valueOf(p))).longValueExact()) % (p);
		return res;
	}

	private static BigNumber nCrModP(BigNumber n, BigNumber r, BigNumber p) {
		if (r.equals(ZERO))
			return ONE;
		long ni = (n.mod(p)).longValueExact();
		long ri = (r.mod(p)).longValueExact();
		BigNumber r1 = nCrModP(n.divide(p), r.divide(p), p);
		long r2 = nCrModpDP(ni, ri, p.intValueExact());
		if (r1 == BigInteger.ZERO || r2 == 0)
			return ZERO;
		return (r1.multiply(valueOf(r2))).mod(p);
	}

	/**
	 * Returns the highest power of a prime number that appears in the prime
	 * factorization of {@code this} factorial.Runs in a time complexity of
	 * O(log({@code this})).
	 *
	 * @param {{@code p},the Modulus,which must be a prime number.
	 * @return The highest power of {@code p} that appears in the prime
	 *         factorization of {@code this} factorial
	 * @throws ArithmeticException if {@code p} is not a prime number,or any of the
	 *                             parameters are negative,including {@code this}.
	 * 
	 * 
	 */

	public BigNumber factorization(BigNumber p) {
		BigNumber n = this;
		if (n.signum() != 1)
			throw new ArithmeticException("Factorial must both be positive.");
		if (!(p.isProbablePrime(10)))
			throw new ArithmeticException("Modulus is not prime");
		if (p.compareTo(n) != -1)
			return ZERO;
		BigNumber t = ZERO;
		long count = n.log(p);
		long count1 = 1;
		int count2 = (int) count1;
		do {
			t = t.add(n.divide(p.pow(count2)));
			count1++;
		} while (count1 <= count);
		return t;
	}

	/**
	 * Efficiently finds the sum of the geometric series
	 * (c+cb+cb<sup>2</sup>+cb<sup>3</sup>+....+cb<sup>e</sup>)mod m in a time of
	 * O(log(r)).
	 * 
	 * @param c,the constant term
	 * @param b,the base
	 * @param e,the exponent
	 * @param m,the modulus
	 * @return the sum of the geometric series
	 *         (c+cb+cb<sup>2</sup>+cb<sup>3</sup>......cb<sup>e</sup>)mod m.
	 * @throws ArithmeticException if any paraeters are not positive
	 * @see https://en.wikipedia.org/wiki/Geometric_series
	 */
	public static BigNumber geometricSeriesModuloPrime(BigNumber c, BigNumber b, BigNumber e, BigNumber m) {
		if (m.signum() != 1)
			throw new ArithmeticException("Modulus must be positive");
		if (e.signum() != 1)
			throw new ArithmeticException("Exponent must be positive");
		if (b.signum() != 1)
			throw new ArithmeticException("Base must be positive");
		if (c.signum() != 1)
			throw new ArithmeticException("Constant term must be positive");
		c = c.mod(m);
		BigNumber m1 = m;
		BigNumber l1 = b.modPow(e.add(ONE), m);
		BigNumber a1 = b.subtract(ONE);
		BigNumber r1 = (l1.multiply(c)).mod(m);
		BigNumber gcd = a1.gcd(m1);
		a1 = a1.divide(gcd);
		m1 = m1.divide(gcd);
		BigNumber r2 = a1.modInverse(m1);
		BigNumber res = (r1.multiply(r2)).mod(m);
		return res;
	}

	/**
	 * Evaluates the Jacobi Symbol (n|p), where p is an odd prime number.
	 */

	public BigNumber evaluateJacobiSymbol(BigNumber p) {
		if (!p.isProbablePrime(10) || p.equals(TWO))
			throw new ArithmeticException("Modulus must be prime");
		BigNumber q = this.modPow((p.subtract(ONE)).divide(TWO), p);
		if (q.equals(ONE))
			return ONE;
		if (q.equals(ZERO))
			return ZERO;
		else
			return NEGATIVE_ONE;
	}

	/**
	 * {@code this} function returns {@code true} if the Jacobi Symbol
	 * ({@code this}|p)==1.If the Jacobi symbol is not 1 ,then it returns
	 * {@code false}.In other words,it returns {@code true} if and only if there are
	 * whole number solutions of x for the modular equation x<sup>2</sup>
	 * {@code - this = 0 mod(p)},where p is prime, else, it returns {@code false}.
	 *
	 * @param p,a prime number,the Modulus.
	 * @return the Jacobi Symbol (a|p).
	 * @throws ArithmeticException if p is not prime or p is negative.
	 * @see https://en.wikipedia.org/wiki/Euler%27s_criterion
	 * 
	 */
	public boolean jacobiSymbol(BigNumber p) {
		if (!(p.isProbablePrime(10)))
			throw new ArithmeticException("Modulus must be an odd prime");
		if (p.equals(BigNumber.TWO))
			return true;
		return this.evaluateJacobiSymbol(p).equals(ONE);
	}

	/**
	 * Takes in an array containing 3 values {a,b,c} which are the parameters in the
	 * equation ax<sup>2</sup>bx+c=0 mod({@code this}<sup>r</sup> ),where
	 * {@code this} is a Prime Number,and r is the exponent.Returns {@code null} if
	 * no solutions exist,else it returns a {@code BigNumber} x,such that
	 * ax<sup>2</sup>bx+c=0 mod({@code this}<sup>r</sup> )
	 * 
	 * @param arr ,the Array containing the values for the Quadratic Equation
	 * @param r   ,the exponent of the modulus
	 * @return A value val,such that a(val<sup>2</sup>)+b(val)+c=0
	 *         mod({@code this}<sup>r</sup>)
	 * @throws ArithmeticException if array length is not 3,first term is zero,or
	 *                             modulus is not a positive power of an odd prime
	 *                             number,
	 * 
	 */
	public BigNumber modularSquareRoot(BigNumber[] arr, int r) {
		BigNumber p = this;
		BigNumber f = p.pow(r);
		if (arr.length != 3)
			throw new ArithmeticException("Array Length must be 3");
		if (!p.isProbablePrime(10) || Math.signum(r) != 1 || p.equals(TWO))
			throw new ArithmeticException("Modulus must be a Positive Power of an odd Prime number");
		BigNumber a = arr[0].mod(f);
		BigNumber b = arr[1].mod(f);
		BigNumber c = arr[2].mod(f);
		if (a.mod(p).equals(ZERO))
			throw new ArithmeticException("First term must not be divsible by the modulus base ");
		if (c.equals(ZERO))
			return ZERO;
		BigNumber gcd = a.gcd(b.gcd(c));
		a = a.divide(gcd);
		b = b.divide(gcd);
		c = c.divide(gcd);
		BigNumber gcd1 = a.gcd(f);
		BigNumber a1 = a.divide(gcd1);
		BigNumber f1 = f.divide(gcd1);
		BigNumber r0 = a1.modInverse(f1);
		a = ONE;
		b = (b.multiply(r0));
		c = (c.multiply(r0));
		b = b.add((b.mod(TWO)).multiply(f));
		BigNumber r1 = b.divide(TWO);
		BigNumber r2 = r1.pow(2).subtract(c);
		if (r2.equals(ZERO))
			return (r1.multiply(NEGATIVE_ONE)).mod(f);
		BigNumber r3 = r2.modularSquareRoot(p, r);
		if (r3 == null)
			return null;
		BigNumber res = (r3.subtract(r1)).mod(f);
		return res;
	}

	/**
	 * Computes the modular n'th root, where n must be coprime to p-1.
	 * 
	 * @param p, the modulus, a prime number.
	 * @param n
	 * @return a number x, such that x<sup>a</sup>-{@code this}=0 mod(p).
	 */

	public BigNumber coprimeModularNthRoot(BigNumber p, BigNumber a) {
		BigNumber q = p.subtract(ONE);
		if (!p.isProbablePrime(10) || p.equals(TWO))
			throw new ArithmeticException("Modulus must be an odd prime");
		if (!a.gcd(q).equals(ONE))
			throw new ArithmeticException("Exponent must be coprime with one less than the modulus");
		return this.modPow(a.modInverse(q), p);
	}

	// FIXME
	public BigNumber modularExponentationRoot(BigNumber p, int r, int e) {
		int count = 1;
		BigNumber t = this;
		if (!p.isProbablePrime(10) || p.equals(TWO))
			throw new ArithmeticException("Modulus must be an odd prime");
		if (Math.signum(e) == -1)
			throw new ArithmeticException("Exponent must be positive");
		if (Math.signum(r) != 1)
			throw new ArithmeticException("Power of the prime number must be positive");
		if (e == 0)
			return t.modularSquareRoot(p, r);
		do {
			t = t.modularSquareRoot(p, r);
			count++;
		} while (count <= e && !t.equals(null));
		return t;
	}

	/**
	 * Returns a value x,such that x<sup>2</sup>-{@code this}=0 mod
	 * (p<sup>r</sup>),where p is a prime number.
	 * 
	 * @param p,the modulus,a prime number.
	 * @param r,the exponent.
	 * @return A value x,such that x<sup>2</sup>-{@code this}=0 mod
	 *         (p<sup>r</sup>),or {@code null} is no solutions exist.
	 */

	public BigNumber modularSquareRoot(BigNumber p, int r) {
		BigNumber t = this;
		if (!p.isProbablePrime(10) || p.equals(TWO))
			throw new ArithmeticException("Base must be a positive odd Prime Number");
		if (Math.signum(r) != 1)
			throw new ArithmeticException("Exponent must be positive number");
		if (!t.jacobiSymbol(p))
			return null;
		BigNumber x = t.modularSquareRoot(p);
		if (r == 1)
			return x;
		if (x == ZERO)
			return ZERO;
		BigNumber totient = p.pow(r - 1);
		BigNumber modulus = totient.multiply(p);
		BigNumber res1 = x.modPow(totient, modulus);
		BigNumber h1 = (totient.multiply(p.subtract(TWO)).add(ONE)).divide(TWO);
		BigNumber res2 = t.modPow(h1, modulus);
		BigNumber res = (res1.multiply(res2)).mod(modulus);
		return res;
	}

	private BigNumber modularSquareRoot(BigNumber p) {
		BigNumber n = this;
		n = n.mod(p);
		BigNumber m;
		BigNumber mod;
		BigNumber[] sqrt = n.sqrtAndRemainder();
		if (n.equals(ZERO))
			return ZERO;
		if (sqrt[1].equals(ZERO))
			return sqrt[0];
		if (p.mod(FOUR).equals(THREE))
			return n.modPow((p.add(ONE)).divide(FOUR), p);
		if (p.mod(EIGHT).equals(FIVE)) {
			m = (p.subtract(FIVE)).divide(EIGHT);
			BigInteger r = n.modPow(TWO.multiply(m).add(ONE), p);
			if (r.equals(ONE))
				return n.modPow(m.add(ONE), p);
			if (!(r.equals(ONE))) {
				mod = (FOUR.multiply(n)).modPow(m.add(ONE), p);
				if (mod.mod(TWO).equals(ZERO))
					return mod.divide(TWO);
				else
					return (mod.add(p)).divide(TWO);
			}
		} else {
			return sTonelli(n, p);
		}
		return null;
	}

	private static BigNumber sTonelli(BigNumber a, BigNumber p) {
		BigNumber p1 = p;
		BigNumber v = null;
		if (p.equals(TWO))
			return a;
		long t = 0;
		BigNumber k = p.subtract(ONE);
		long s = 0;
		while (!k.testBit(0)) {
			s++;
			k = k.shiftRight(1);
		}
		k = k.subtract(ONE);
		k = k.shiftRight(1);
		BigNumber r = a.modPow(k, p);
		BigNumber n = r.multiply(r).remainder(p);
		n = n.multiply(a).remainder(p);
		r = r.multiply(a).remainder(p);
		if (n.equals(ONE))
			return r;
		BigNumber z = TWO;
		while (z.jacobiSymbol(p1))
			z = z.add(ONE);
		v = k;
		v = v.multiply(TWO);
		v = v.add(ONE);
		BigInteger c = z.modPow(v, p);
		while (n.compareTo(ONE) == 1) {
			k = n;
			t = s;
			s = 0;
			while (!k.equals(ONE)) {
				k = k.multiply(k).mod(p);
				s++;
			}
			t -= s;
			if (t == 0)
				return null;
			v = ONE;
			for (long i = 0; i < t - 1; i++)
				v = v.shiftLeft(1);
			c = c.modPow(v, p); // c = c^v mod p
			r = r.multiply(c).remainder(p); // r = r * c % p
			c = c.multiply(c).remainder(p); // c = c^2 % p
			n = n.multiply(c).mod(p); // n = n * c % p
		}
		return r;
	}

	/**
	 * Calculates powers of complex numbers of the form (a+bi)^p mod(m). Runs in a
	 * time complexity of O((log p)^2).
	 * 
	 * @param a,the real part of the complex number
	 * @param b,the imaginary part of the complex number
	 * @param p,the exponent
	 * @param m,the modulus
	 * @return An Array of length 2,containing the real and complex results.
	 * @throws ArithmeticException if exponent or modulus is not positive.
	 */
	public static BigNumber[] complexExponentation(BigNumber a, BigNumber b, BigNumber p, BigNumber m) {
		BigNumber[] arr = { ONE, ZERO };
		if (p.signum() == -1)
			throw new ArithmeticException("Exponent not positive");
		if (m.signum() == -1 || m.equals(ZERO))
			throw new ArithmeticException("Modulus not positive");
		if (p.equals(ZERO))
			return (BigNumber[]) arr;
		assert (p.signum() == 1 && m.signum() == 1 && p != ZERO);
		BigNumber rem = p;
		do {
			BigNumber r1 = exp(a, b, rem, m)[0];
			BigNumber r2 = exp(a, b, rem, m)[1];
			BigNumber d = ((arr[0].multiply(r2)).add(r1.multiply(arr[1]))).mod(m);
			arr[0] = ((arr[0].multiply(r1)).subtract((r2.multiply(arr[1])))).mod(m);
			arr[1] = d;
			rem = exp(a, b, rem, m)[2];
		} while (!(rem.equals(ZERO)));
		return (BigNumber[]) arr;
	}

	private static BigNumber[] exp(BigNumber a, BigNumber b, BigNumber p, BigNumber m) {
		if (p.equals(ONE)) {
			BigNumber[] arr = { a.mod(m), b.mod(m), ZERO };
			return arr;
		}
		int count0 = 0;
		int count2 = 0;
		BigNumber l;
		BigNumber s1 = ONE;
		do {
			s1 = s1.multiply(TWO);
			count0++;
		} while (s1.compareTo(p) != 1);
		do {
			count2++;
			l = (TWO.multiply(a).multiply(b)).mod(m);
			a = ((a.pow(2)).subtract((b.pow(2)))).mod(m);
			b = l;
		} while (count2 < count0 - 1);
		BigNumber[] arr = { a, b, p.subtract(TWO.pow(count0 - 1)) };
		return arr;
	}

	/**
	 * If {@code this}.isMersennePrime() returns {@code true},then
	 * 2^({@code this})-1 is a prime number. If it returns false,then
	 * 2^({@code this})-1 is not prime.Note that {@code this} program may take a
	 * long time to run,so it only accepts int size numbers,and that the user is
	 * encouraged to use {@code this} program as sparingly as possible, since it
	 * uses a lot of space.If ({@code this}) is not prime ,then it always returns
	 * false,since 2^({@code this})-1 is never prime,when ({@code this}) is not
	 * prime.
	 * 
	 * @return {@code true} if the ({@code this}) Mersenne Number is a prime number.
	 * @throws ArithmeticException if exponent is out of int range,or is not
	 *                             positive.
	 * 
	 */
	// FIXME
	public boolean lucasLehmerTest() {
		short c1 = this.shortValueExact();
		BigNumber c = valueOf(c1);
		if (c.compareTo(valueOf(INT_MAX_VALUE)) == 1)
			reportOverflow();
		if (c.signum() != 1)
			throw new ArithmeticException("Exponent not positive");
		if (c.isProbablePrime(10) == false)
			return false;
		int p = c.intValueExact();
		var v = FOUR;
		var rem = v;
		var m = TWO.pow(p).subtract(ONE);
		for (int count = 1; count <= p - 2; count++)
			rem = (rem.pow(2).subtract(TWO).mod(m));
		if (rem.equals(ZERO))
			return true;
		else
			return false;
	}

	/**
	 * Returns the sum of two complex numbers,(a+bi)+(c+di).
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 * @return An array containing the real and complex parts of (a+bi)+(c+di)
	 *         respectively.
	 * 
	 */
	// FIXME
	public static BigNumber[] complexAdd(BigNumber a, BigNumber b, BigNumber c, BigNumber d) {
		BigNumber r1 = a.add(b);
		BigNumber r2 = c.add(d);
		BigNumber[] arr = { r1, r2 };
		return arr;
	}

	/**
	 * Returns the sum of (a+bi)x(c+di).
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 * @return An array of length two containing the real and complex parts of
	 *         (a+bi)x(c+di) respectively.
	 * 
	 */
	public static BigNumber[] complexMultiply(BigNumber a, BigNumber b, BigNumber c, BigNumber d) {
		BigNumber r1 = (a.multiply(c)).subtract(b.multiply(d));
		BigNumber r2 = (a.multiply(d)).add(b.multiply(c));
		BigNumber[] arr = { r1, r2 };
		return arr;
	}

	/**
	 * Returns an array containing the value of x and y such that
	 * a(x)=({@code this})mod(b), and y=(a(x)-{@code this})/b.{@code this} uses the
	 * extended Euclidean algorithm to calculate the modular inverse,then multiplies
	 * it by ({@code this}) to get x,then calculates (a(x)-{@code this})/b.
	 * 
	 * @param a
	 * @param b
	 * @return An array of length two containing x and y such that
	 *         a(x)-b(y)={@code this}.If no solutions exist,it returns null.
	 *
	 */
	public BigNumber[] modularSolve(BigNumber a, BigNumber b) {
		BigNumber c = this;
		if (c == ZERO) {
			BigNumber[] arr = { b, a };
			return arr;
		}
		int sig = b.signum();
		a = a.multiply(valueOf(sig));
		b = b.multiply(valueOf(sig));
		c = c.multiply(valueOf(sig));
		// solve for ax-by=gcd(a,b)
		BigNumber gcd = a.gcd(b);
		BigNumber a1 = a.divide(gcd);
		BigNumber b1 = b.divide(gcd);
		BigNumber inv = a1.modInverse(b1);
		inv = inv.multiply(c);
		BigNumber y = (a.multiply(inv).subtract(c)).divide(b);
		BigNumber[] arr = { inv, y };
		return arr;
	}

	/**
	 * Returns an array containing two prime numbers,such that their sum is equal to
	 * 2*({@code this}).
	 * 
	 * @return an Arrays containing two prime numbers,such that their sum is equal
	 *         to 2*({@code this}).
	 * @throws ArithmeticException if ({@code this}) is negative;.
	 */
	public BigNumber[] sumOfTwoPrimes() {
		if (this.signum() != 1)
			throw new ArithmeticException("Input must be positive");
		BigNumber n = TWO.multiply(this);
		BigNumber a = ZERO;
		BigNumber b = ZERO;
		do {
			a = a.nextProbablePrime();
			b = n.subtract(a);
		} while (!b.isProbablePrime(10));
		BigNumber[] arr = { a, b };
		return arr;
	}

	/**
	 * Returns an Array containing two prime numbers,such that their difference is
	 * equal to 2*({@code this}).
	 * 
	 * @return An Array containing two prime numbers,such that their difference is
	 *         2*({@code this}).
	 * @throws ArithmeticException if ({@code this}) is negative.
	 */

	public BigNumber[] diffOfTwoPrimes() {
		BigNumber b = this;
		if (b.signum() != 1)
			throw new ArithmeticException("Input must be positive");
		BigNumber p1 = TWO.multiply(b);
		BigNumber p2 = null;
		do {
			p1 = p1.nextProbablePrime();
			p2 = p1.subtract(TWO.multiply(b));
		} while (!p2.isProbablePrime(10));
		BigNumber[] arr = { p1, p2 };
		return arr;
	}

	/**
	 * Returns the highest power of a prime number p that appears in the prime
	 * faactorization of the Binomial Coefficient (n r).
	 * 
	 * @param n
	 * @param r
	 * @return Returns the highest power of a prime number p,that appears in the
	 *         prime factorization of the Binomial Coefficient (n r).
	 * @throws ArithmeticException in n,r,or p is negative,or if p is not prime.
	 */

	public BigNumber ordNcR(BigNumber n, BigNumber r) {
		BigNumber p = this;
		if (n.equals(ZERO))
			n = ONE;
		if (n.signum() == -1 || r.signum() == -1 || p.signum() == -1)
			throw new ArithmeticException("Cannot have negative parameters");
		if (!p.isProbablePrime(10))
			throw new ArithmeticException("Modulus is not prime");
		if (n.compareTo(r) == -1)
			return ZERO;
		if (n.compareTo(p) == -1)
			return ZERO;
		BigNumber a = n.factorization(p).subtract(r.factorization(p)).subtract((n.subtract(r)).factorization(p));
		if (a.signum() == -1)
			return ZERO;
		return a;
	}

	/**
	 * Returns the representation of ({@code this}) under a given radix.
	 * 
	 * @param radix
	 * @return the representation of ({@code this}) under a given radix
	 * @throws ArithmeticException if the radix is less than 2,or out of the int
	 *                             value.
	 */
	public BigNumber toSpecifiedRadix(int radix) {
		if (radix < 2)
			throw new ArithmeticException("Radix cannot be less than 2");
		if (radix > 2147483647)
			throw new ArithmeticException("Radix too large");
		return new BigNumber(this.toString(radix));
	}

	/**
	 * Returns {@code floor(log}<sub>p</sub>({@code this})).
	 * 
	 * @param p
	 * @return {@code floor(log}<sub>p</sub>({@code this})).
	 * @throws ArithmeticException if p<2,or {@code this} is not positive.
	 */
	public long log(BigNumber p) {
		BigNumber n = this;
		if (p.compareTo(ONE) != 1)
			throw new ArithmeticException("Base cannot be less than 2");
		if (n.compareTo(ZERO) != 1)
			throw new ArithmeticException("Number must be positive");
		if (p.compareTo(n) == 1)
			return 0;
		BigNumber prod = p;
		long count = 0;
		while (prod.compareTo(n) != 1) {
			prod = prod.multiply(p);
			count++;
		}
		return count;
	}

	/**
	 * Returns a number x,such that {@code this}+P(x) is a prime number.In other
	 * words,a number x is returned such that the (x-1)th term in the Arithmetic
	 * Progression {@code this}+P(T) is prime.
	 * 
	 * @param P,the common difference.
	 * @return
	 */
	public BigNumber primeProgression(int p) {
		BigNumber p1 = valueOf(p);
		BigNumber a = this.mod(p1);
		if (!a.gcd(p1).equals(ONE))
			throw new ArithmeticException("First term and common difference must be coprime");
		if (p1.signum() != 1)
			throw new ArithmeticException("Common diff must be positive");
		BigNumber count = ZERO;
		BigNumber res = a;
		do {
			count = count.add(ONE);
			res = res.add(p1);
		} while (!res.isProbablePrime(10));
		return count;
	}

	/**
	 * Returns the {@code this}'th fibonacci number modulo a given number.
	 * 
	 * @param n,the Modulus.
	 * @return The {@code this}'th Fibonacci number mod m.
	 * @throws ArithmeticException if ({@code this}) ,or m, is not positive.
	 */
	public BigNumber fibonacciMod(BigNumber modulus) {
		BigNumber m = this;
		BigNumber n = modulus;
		if (m.signum() != 1)
			throw new ArithmeticException("Fibonacci number not positive");
		if (n.signum() != 1)
			throw new ArithmeticException("Modulus not positive");
		BigNumber F[][] = new BigNumber[][] { { (ONE), (ONE) }, { (ONE), (ZERO) } };
		if (n.equals(ZERO))
			return ZERO;
		power(F, n.subtract(ONE), m);
		return F[0][0];
	}

	private static void multiply(BigNumber[][] f, BigNumber[][] f2, BigNumber m) {
		f[0][0] = (f[0][0].multiply(f2[0][0]).add(f[0][1].multiply(f2[1][0]))).mod(m);
		f[0][1] = (f[0][0].multiply(f2[0][1]).add(f[0][1].multiply(f2[1][1]))).mod(m);
		f[1][0] = (f[1][0].multiply(f2[0][0]).add(f[1][1].multiply(f2[1][0]))).mod(m);
		f[1][1] = (f[1][0].multiply(f2[0][1]).add(f[1][1].multiply(f2[1][1]))).mod(m);
	}

	private static void power(BigNumber[][] f, BigNumber b, BigNumber m) {
		if (b == ZERO || b.equals(ONE))
			return;
		BigNumber[][] M = new BigNumber[][] { { ONE, ONE }, { ONE, ZERO } };
		power(f, b.divide(TWO), m);
		multiply(f, f, m);
		if (!(b.mod(TWO).equals(ZERO)))
			multiply(f, M, m);
	}

	/**
	 * Returns the {@code this}'th Lucas number mod m.Note that for all prime
	 * numbers p,L<sub>p</sub>,the {@code p}'th lucas number,is congruent to 1
	 * modulo p.
	 * 
	 * @param m , the modulus
	 * @return The {@code this}'th fibonacci number mod m.
	 * @throws ArithmeticException if m or {@code this} is not positive.
	 */

	public BigNumber lucasMod(BigNumber m) {
		if (this.signum() != 1 || m.signum() != 1)
			throw new ArithmeticException("Lucas number and modulus must be positive");
		return ((this.subtract(ONE)).fibonacciMod(m).add((this.add(ONE)).fibonacciMod(m))).mod(m);
	}

	/**
	 * Returns an Array containing non trivial values X and Y,such that
	 * X<sup>2</sup>-n(Y<sup>2</sup>)=1.
	 * 
	 * @param n,the Argument
	 * @throws ArithmeticException if the Argument is not positive,a perfect square.
	 * @throws ArithmeticException if argument is too large.
	 * 
	 */
	public static BigNumber[] pellsEquation(int n) {
		BigInteger helper = BigInteger.valueOf(n);
		BigInteger[] sqrt = helper.sqrtAndRemainder();
		if (helper.compareTo(BigInteger.valueOf(INT_MAX_VALUE)) == 1)
			throw new ArithmeticException("Argument too large");
		if (helper.signum() != 1)
			throw new ArithmeticException("Argument not positive");
		if (sqrt[1] == BigInteger.ZERO)
			throw new ArithmeticException("Argument cannot be a perfect square");
		List<Long> continuedFrac = continuedFraction(n);
		int count = 0;
		BigInteger ajm2 = BigInteger.ONE;
		BigInteger ajm1 = new BigInteger(sqrt[0] + "");
		BigInteger bjm2 = BigInteger.ZERO;
		BigInteger bjm1 = BigInteger.ONE;
		boolean stop = (continuedFrac.size() % 2 == 1);
		if (continuedFrac.size() == 2)
			stop = true;
		while (true) {
			count++;
			BigInteger bn = new BigInteger(continuedFrac.get(count) + "");
			BigInteger aj = bn.multiply(ajm1).add(ajm2);
			BigInteger bj = bn.multiply(bjm1).add(bjm2);
			if (stop && (count == continuedFrac.size() - 2 || continuedFrac.size() == 2))
				return new BigNumber[] { valueOf(aj), valueOf(bj) };
			else if (continuedFrac.size() % 2 == 0 && count == continuedFrac.size() - 2)
				stop = true;
			if (count == continuedFrac.size() - 1)
				count = 0;
			ajm2 = ajm1;
			ajm1 = aj;
			bjm2 = bjm1;
			bjm1 = bj;
		}
	}

	private static List<Long> continuedFraction(long n) {
		List<Long> answer = new ArrayList<Long>();
		long a0 = (long) Math.sqrt(n);
		answer.add(a0);
		long a = -a0;
		long aStart = a;
		long b = 1;
		long bStart = b;
		while (true) {
			long[] values = iterateFrac(n, a, b);
			answer.add(values[0]);
			a = values[1];
			b = values[2];
			if (a == aStart && b == bStart)
				break;
		}
		return answer;
	}

	private static long[] iterateFrac(long n, long a, long b) {
		long x = (long) Math.floor((b * Math.sqrt(n) - b * a) / (n - a * a));
		long[] answer = new long[3];
		answer[0] = x;
		answer[1] = -(b * a + x * (n - a * a)) / b;
		answer[2] = (n - a * a) / b;
		return answer;
	}

	/**
	 * Returns an array containing four {@code BigNumber},such that the sum of their
	 * squares is equal to {@code this},the prime number,whose sum of squares is
	 * desired.
	 * 
	 * @throws ArithmeticException is {@code this} is not prime.
	 * @return Array containing four BigNumbers,such that the sum of their squares
	 *         is {@code this}.
	 * 
	 */
	public BigNumber[] primeSumOfFourSquares() {
		BigNumber p = this;
		if (p.equals(TWO)) {
			BigNumber[] arr = { ONE, ONE, ZERO, ZERO };
			return arr;
		}
		if (p.mod(FOUR).equals(ONE))
			return p.primeSum1();
		BigNumber s1;
		BigNumber s2 = ONE;
		BigNumber cr;
		do {
			s2 = s2.add(ONE);
			cr = (s2.pow(2).add(ONE)).multiply(NEGATIVE_ONE);
			s1 = (cr).modularSquareRoot(p);
		} while (s1 == null);
		if (s1.compareTo(p.divide(TWO)) == -1)
			s1 = p.subtract(s1);
		BigNumber s3 = ONE;
		BigNumber s4 = ZERO;
		BigNumber k = ((s1.pow(2)).add(s2.pow(2)).add(s3.pow(2)).add(s4.pow(2))).divide(p);
		return primeSum(s1, s2, s3, s4, k);
	}

	private BigNumber[] primeSum(BigNumber s1, BigNumber s2, BigNumber s3, BigNumber s4, BigNumber k) {
		do {
			BigNumber a = s1;
			BigNumber b = s2;
			BigNumber c = s3;
			BigNumber d = s4;
			s1 = s1.mod(k);
			s2 = s2.mod(k);
			s3 = s3.mod(k);
			s4 = s4.mod(k);
			BigNumber k2 = (k.add(ONE)).divide(TWO);
			if (s1.compareTo(k2) != -1)
				s1 = s1.subtract(k);
			if (s2.compareTo(k2) != -1)
				s2 = s2.subtract(k);
			if (s3.compareTo(k2) != -1)
				s3 = s3.subtract(k);
			if (s4.compareTo(k2) != -1)
				s4 = s4.subtract(k);
			BigNumber div = ((s1.pow(2)).add(s2.pow(2)).add(s3.pow(2)).add(s4.pow(2))).divide(k);
			BigNumber A = s1;
			BigNumber B = s2;
			BigNumber C = s3;
			BigNumber D = s4;
			s1 = ((a.multiply(A)).add(b.multiply(B)).add(c.multiply(C)).add(d.multiply(D))).divide(k);
			s2 = ((a.multiply(B)).subtract(b.multiply(A)).add(d.multiply(C)).subtract(c.multiply(D))).divide(k);
			s3 = ((a.multiply(C)).subtract(c.multiply(A)).add(b.multiply(D)).subtract(d.multiply(B))).divide(k);
			s4 = ((a.multiply(D)).subtract(d.multiply(A)).add(c.multiply(B)).subtract(b.multiply(C))).divide(k);
			k = div;
		} while (k.compareTo(ONE) == 1);
		// BigNumber[] arr1 = { s1.abs(), s2.abs(), s3.abs(), s4.abs() };
		return new BigNumber[] { s1.abs(), s2.abs(), s3.abs(), s4.abs() };
	}

	protected BigNumber[] primeSum1() {
		BigNumber p = this;
		BigNumber b = ONE;
		BigNumber c = ONE;
		boolean t;
		do {
			c = c.add(ONE);
			t = c.jacobiSymbol(p);
		} while (t);
		BigNumber exp = (p.subtract(ONE)).divide(FOUR);
		BigNumber a = c.modPow(exp, p);
		if (a.compareTo(exp.divide(TWO)) == 1)
			a = p.subtract(a);
		BigNumber k = (a.pow(2).add(b.pow(2))).divide(p);
		do {
			BigNumber ah = a;
			BigNumber bh = b;
			a = a.mod(k);
			b = b.mod(k);
			BigNumber k2 = (k.subtract(ONE)).divide(TWO);
			if (a.compareTo(k2) != -1)
				a = a.subtract(k);
			if (b.compareTo(k2) != -1)
				b = b.subtract(k);
			BigNumber div = (a.pow(2).add(b.pow(2))).divide(k);
			BigNumber r1 = a;
			a = (ah.multiply(a).add(bh.multiply(b))).divide(k);
			b = (ah.multiply(b).subtract(bh.multiply(r1))).divide(k);
			k = div;
		} while (k.compareTo(ONE) == 1);
		BigNumber[] arr = { a.abs(), b.abs(), ZERO, ZERO };
		return arr;
	}

	public BigNumber[] sumOfSquares(BigNumber degree) {
		BigNumber p = this;
		BigNumber d = degree.multiply(NEGATIVE_ONE);
		if (degree.multiply(valueOf(degree.signum())).compareTo(p) != -1)
			throw new ArithmeticException("Degree must be less than accessor");
		if (!p.isProbablePrime(10) || p.equals(TWO))
			throw new ArithmeticException("Accessor must be prime");
		if (!d.jacobiSymbol(p))
			return null;
		BigNumber a = d.modularSquareRoot(p);
		BigNumber b = ONE;
		if (a.compareTo((p.subtract(ONE)).divide(TWO)) == 1)
			a = p.subtract(a);
		BigNumber k = (a.pow(2).add(degree.multiply(b.pow(2)))).divide(p);
		if (k.equals(ONE)) {
			BigNumber[] arr = { a.abs(), b.abs(), ZERO, ZERO };
			return arr;
		}
		do {
			BigNumber ah = a;
			BigNumber bh = b;
			a = a.mod(k);
			b = b.mod(k);
			BigNumber k2 = (k.subtract(ONE)).divide(TWO);
			if (a.compareTo(k2) != -1)
				a = a.subtract(k);
			if (b.compareTo(k2) != -1)
				b = b.subtract(k);
			BigNumber div = (a.pow(2).add((b.pow(2)).multiply(degree))).divide(k);
			BigNumber r1 = a;
			a = (ah.multiply(a).add(bh.multiply(b.multiply(degree)))).divide(k);
			b = (ah.multiply(b).subtract(bh.multiply(r1))).divide(k);
			if (div.signum() == -1)
				return null;
			if (k.compareTo(div) == -1)
				return null;
			k = div;
		} while (k.compareTo(ONE) == 1);
		BigNumber[] arr = { a.abs(), b.abs(), ZERO, ZERO };
		return arr;

	}

	public BigNumber lcm(BigNumber b) {
		BigNumber a = this;
		if (a.equals(ZERO) || b.equals(ZERO))
			return ZERO;
		if (a.equals(ONE))
			return b;
		if (b.equals(ONE))
			return a;
		return (a.multiply(b)).divide(a.gcd(b));
	}

	public static BigNumber crt(BigNumber[] remainders, BigNumber[] divisors) {
		int len = divisors.length;
		if (len - remainders.length != 0)
			throw new ArithmeticException("Every divisor must have a corresponding remainder.");
		try {
			BigNumber sum = ZERO;
			for (int i = 0; i < divisors.length; i++)
				divisors[i] = divisors[i].abs();
			BigNumber prod = ONE;
			for (int i = 0; i < len; i++)
				prod = prod.multiply(divisors[i]);
			for (int i = 0; i < len; i++) {
				BigNumber di = divisors[i];
				BigNumber ai;
				BigNumber ri = remainders[i];
				BigNumber yi = prod.divide(di);
				ai = yi.modInverse(di);
				sum = sum.add(ai.multiply(yi).multiply(ri));
			}
			return sum.mod(prod);
		} catch (ArithmeticException a) {
			throw new ArithmeticException("All divisors must be coprime to each other.");
		}
	}

	public BigNumber[] sumOfSq() {
		int k1 = 0;
		BigNumber n = this;
		if (n.isProbablePrime(10))
			return n.primeSumOfFourSquares();
		if (n.mod(EIGHT).equals(FOUR)) {
			k1 = 1;
			n = n.divide(FOUR);
		}
		BigNumber count = ONE;
		BigNumber res;
		BigNumber modulus;
		do {
			res = n.multiply(count);
			modulus = res.mod(EIGHT);
			if (modulus.equals(TWO))
				break;
			count = count.add(ONE);
		} while (!modulus.equals(TWO));
		BigNumber init0 = ONE;
		BigNumber init1 = res.subtract(init0);
		do {
			do
				init0 = init0.add(FOUR);
			while (!init0.isProbablePrime(10));
			init1 = res.subtract(init0);
		} while (!init1.isProbablePrime(10));
		BigNumber[] arr0 = init0.primeSum1();
		BigNumber[] arr1 = init1.primeSum1();
		BigNumber exp = TWO.pow(k1);
		BigNumber s1 = arr0[0].multiply(exp);
		BigNumber s2 = arr0[1].multiply(exp);
		BigNumber s3 = arr1[0].multiply(exp);
		BigNumber s4 = arr1[1].multiply(exp);
		BigNumber d1 = (arr0[0].pow(2).add(arr0[1].pow(2)).add(arr1[0].pow(2)).add(arr1[1].pow(2)));
		d1 = d1.divide(n);
//		BigNumber s1=arr0[0];
//		BigNumber s2=arr0[1];
//		BigNumber s3=arr1[0];
//		BigNumber s4=arr1[1];
		BigNumber k = d1;
		do {
			BigNumber a = s1;
			BigNumber b = s2;
			BigNumber c = s3;
			BigNumber d = s4;
			s1 = s1.mod(k);
			s2 = s2.mod(k);
			s3 = s3.mod(k);
			s4 = s4.mod(k);
			BigNumber k2 = (k.subtract(ONE)).divide(TWO);
			if (s1.compareTo(k2) != -1)
				s1 = s1.subtract(k);
			if (s2.compareTo(k2) != -1)
				s2 = s2.subtract(k);
			if (s3.compareTo(k2) != -1)
				s3 = s3.subtract(k);
			if (s4.compareTo(k2) != -1)
				s4 = s4.subtract(k);
			BigNumber div = ((s1.pow(2)).add(s2.pow(2)).add(s3.pow(2)).add(s4.pow(2))).divide(k);
			BigNumber A = s1;
			BigNumber B = s2;
			BigNumber C = s3;
			BigNumber D = s4;
			s1 = ((a.multiply(A)).add(b.multiply(B)).add(c.multiply(C)).add(d.multiply(D))).divide(k);
			s2 = ((a.multiply(B)).subtract(b.multiply(A)).add(d.multiply(C)).subtract(c.multiply(D))).divide(k);
			s3 = ((a.multiply(C)).subtract(c.multiply(A)).add(b.multiply(D)).subtract(d.multiply(B))).divide(k);
			s4 = ((a.multiply(D)).subtract(d.multiply(A)).add(c.multiply(B)).subtract(b.multiply(C))).divide(k);
			k = div;
		} while (k.compareTo(ONE) == 1);
		BigNumber[] arr11 = { s1.abs(), s2.abs(), s3.abs(), s4.abs() };
		return arr11;
	}

	/**
	 * Computes the continued fraction representation of a number of the form
	 * {@code (a+sqrt(b))/c} a finite amount of times specified by the user.
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @param iterations
	 * @throws ArithmeticException if b is negative, or c is zero.
	 */
	public static BigNumber[] continuedFraction(BigNumber a, BigNumber b, BigNumber c, int iterations) {
		if (b.signum() != 1)
			throw new ArithmeticException("Square root must be real");
		if (c.signum() == 0)
			throw new ArithmeticException("Denominator cannot be zero");
		BigNumber a1 = (a.add(b.sqrt())).divide(c);
		contFrac.add(a1);
		contFrac(a, b, c, iterations);
		return contFrac.toArray(new BigNumber[contFrac.size()]);
	}

	private static void contFrac(BigNumber a, BigNumber b, BigNumber c, int iterations) {
		BigNumber sqrtDelta;
		BigNumber sqrtDeltaNext;
		BigNumber biK, biP, biM;
		BigNumber K, L, M, P, Z;
		if (b.signum() == 0) {
			ShowRational(a, c);
			return;
		}
		if (b.subtract(a.multiply(a)).remainder(c).signum() != 0) {
			b = b.multiply(c).multiply(c);
			a = a.multiply(c.abs());
			c = c.multiply(c.abs());
		}
		sqrtDelta = ZERO.setBit((b.bitLength() + 1) / 2);
		sqrtDeltaNext = b.divide(sqrtDelta).add(sqrtDelta).shiftRight(1);
		while (sqrtDelta.compareTo(sqrtDeltaNext) > 0) {
			sqrtDelta = sqrtDeltaNext;
			sqrtDeltaNext = b.divide(sqrtDelta).add(sqrtDelta).shiftRight(1);
		}
		if (sqrtDelta.multiply(sqrtDelta).equals(b)) {
			ShowRational(a.add(sqrtDelta), c);
			return;
		}
		biP = c;
		biK = biP.signum() > 0 ? sqrtDelta : sqrtDelta.add(ONE);
		biK = biK.add(a);
		if (biK.signum() > 0) {
			if (c.signum() > 0)
				biM = biK.divide(c);
			else
				biM = c.add(ONE).subtract(biK).divide(c.negate());
		} else {
			if (c.signum() > 0)
				biM = biK.add(ONE).subtract(c).divide(c);
			else
				biM = biK.negate().divide(c.negate());
		}
		biM = biM.multiply(c).subtract(a);
		int cont = -1;
		K = P = L = M = NEGATIVE_ONE;
		while (cont < 0 || K.equals(P) == false || L.equals(M) == false) {
			if (cont < 0 && biP.signum() > 0 && biP.compareTo(sqrtDelta.add(biM)) <= 0 && biM.signum() > 0
					&& biM.compareTo(sqrtDelta) <= 0) {
				K = P = biP;
				L = M = biM;
				cont = 0;
			}
			if (cont >= 0) {
				P = b.subtract(M.multiply(M)).divide(P);
				Z = sqrtDelta.add(M).divide(P);
				M = Z.multiply(P).subtract(M);
				cont++;
			} else {
				biP = b.subtract(biM.multiply(biM)).divide(biP);
				if (biP.signum() > 0)
					Z = sqrtDelta.add(biM).divide(biP);
				else
					Z = sqrtDelta.add(ONE).add(biM).divide(biP);
				biM = Z.multiply(biP).subtract(biM);
			}
			contFrac.add(Z);
			if (cont > iterations)
				return;
		}
	}

	private static void ShowRational(BigNumber a, BigNumber c) {
		BigNumber Temp;
		BigNumber GcdAll = a.gcd(c);
		a = a.divide(GcdAll);
		c = c.divide(GcdAll);
		if (c.signum() < 0) {
			a = a.negate();
			c = c.negate();
		}
		a = a.mod(c);
		while (a.signum() > 0)
			if (c.signum() > 0)
				contFrac.add(c.divide(a));
		Temp = c.mod(a);
		c = a;
		a = Temp;
	}

	/**
	 * Returns {@code this} fibonacci number is divisible by {@code fib} th
	 * fibonacci number.
	 * 
	 * @param fib
	 * @return {@code true}, if and only if the {@code this} fibonacci number
	 *         divides the {@code fib}'th fibonacci number.Returns {@code false}
	 *         otherwise.
	 */
	public boolean fibonacciDivide(BigNumber fib) {
		if (this.signum() != 1 || fib.signum() != 1)
			throw new ArithmeticException("BigNumber must be positive");
		if (this.equals(TWO) || fib.equals(TWO))
			return true;
		return (fib.mod(this)).equals(ZERO);
	}

	public int getLength(int radix) {
		return this.toString(radix).length();
	}

	/**
	 * Computes {@code this} as the sum of five integral cubes.
	 * 
	 * @return An array contatinig five integers such the sum of their cubes is
	 *         equal to {@code this}.
	 */
	public BigNumber[] sumOfFiveCubes() {
		BigNumber l = this.mod(THREE);
		BigNumber l1 = this.subtract(l);
		BigNumber[] arr0 = l1.sumOfFourCubes();
		if (l.equals(ZERO)) {
			BigNumber[] arrRes = { arr0[0], arr0[1], arr0[2], arr0[3], ZERO };
			return arrRes;
		}
		if (l.equals(ONE)) {
			BigNumber[] arrRes = { arr0[0], arr0[1], arr0[2], arr0[3], ONE };
			return arrRes;
		}
		if (l.equals(TWO)) {
			BigNumber[] arr1 = (l1.add(THREE)).sumOfFourCubes();
			BigNumber[] arrRes = { arr1[0], arr1[1], arr1[2], arr1[3], NEGATIVE_ONE };
			return arrRes;
		}
		return null;
	}

	BigNumber[] sumOfFourCubes() {
		BigNumber[] a0 = this.divideAndRemainder(SIX);
		if (a0[1].equals(ZERO)) {
			BigNumber[] arr0 = { a0[0].subtract(ONE), a0[0].multiply(NEGATIVE_ONE), a0[0].multiply(NEGATIVE_ONE),
					a0[0].add(ONE) };
			return arr0;
		}
		if (a0[1].equals(THREE)) {
			BigNumber[] arr0 = { a0[0], FOUR.subtract(a0[0]), TWO.multiply(a0[0]).subtract(FIVE),
					FOUR.subtract(TWO.multiply(a0[0])) };
			return arr0;
		}
		return null;
	}

	/**
	 * Returns an array containing two {@code BigNumber}, x and y, such that
	 * {@code  m(x}<sup>2</sup>{@code ) + n(y}<sup>2</sup>{@code ) = this}, where
	 * {@code this} is a prime number.
	 * 
	 * @param m
	 * @param n
	 * @return A {@code BigNumber} array [ x, y ].
	 * @throws ArithmeticException if n or m is not positive, or {@code this} is not
	 *                             prime.
	 */

	public BigNumber[] sumAsQuadraticForm(BigNumber m, BigNumber n) {
		BigNumber p = this;
		if (n.signum() != 1)
			throw new ArithmeticException("n must be positive");
		if (m.signum() != 1)
			throw new ArithmeticException("m must be positive");
		if (!p.isProbablePrime(10) || p.equals(TWO))
			throw new ArithmeticException("p must be an odd prime");
		if (n.compareTo(p) == 1 || m.compareTo(p) == 1)
			return null;
		if (n.equals(p))
			return new BigNumber[] { ZERO, ONE };
		if (m.equals(p))
			return new BigNumber[] { ONE, ZERO };
		BigNumber i = (n.multiply(NEGATIVE_ONE).multiply(m.modPow(p.subtract(TWO), p)));
		BigNumber r0 = i.modularSquareRoot(p);
		// BigNumber res = (r0.pow(2).subtract(i)).mod(p);
		return p.cornacchiasAlgorithm(m, n, r0);
	}

	BigNumber[] cornacchiasAlgorithm(BigNumber m, BigNumber n, BigNumber r0) {
		BigNumber p = this;
		BigNumber x = null;
		if (r0 == null)
			return null;
		if (m.multiply(r0.pow(2)).add(n.multiply(ONE)).equals(p)) {
			BigNumber[] arr = { r0, ONE };
			return arr;
		}
		Vector<BigNumber> vec = new Vector<BigNumber>();
		r0 = r0.min(p.subtract(r0));
		vec.add(p);
		vec.add(r0);
		do {
			if (r0.compareTo((p.divide(m)).sqrt()) == -1)
				break;
			int size = vec.size();
			x = vec.get(size - 2).mod(vec.get(size - 1));
			vec.add(x);
		} while (x.compareTo((p.divide(m)).sqrt()) == 1);
		BigNumber y = ((p.subtract(m.multiply(x.pow(2)))).divide(n)).sqrt();
		if (((m.multiply(x.pow(2))).add(n.multiply(y.pow(2)))).equals(p))
			return new BigNumber[] { x, y };
		else
			return null;
	}

//	public BigNumber[] isPrimePower(BigNumber q) {
//		if (q.isProbablePrime(10))
//			return new BigNumber[] { q, ONE };
//		if (q.equals(ZERO) || q.equals(ONE))
//			return null;
//		if (q.mod(TWO).equals(ZERO)) {
//			long j = q.log(TWO);
//			if (TWO.pow((int) j).equals(q))
//				return new BigNumber[] { TWO, valueOf(j) };
//			return null;
//		}
//		for (int i = 2; i <= q.log(TWO); i++) {
//			long j = q.log(valueOf(i));
//	//		if (q.subtract(valueOf(i).pow((int) j)).equals(ZERO))
//				//return new BigNumber[] { i, j };
//		}
//		return null;
//	}
	/**
	 * 
	 * @param n
	 * @param exp
	 * @param p
	 * @return
	 */
	public BigNumber modularNthRoot(BigNumber n, BigNumber exp) {
		BigNumber t = this.mod(n);
		int count = 2;
		int bl = t.bitLength();
		BigNumber tries;
		if (n.mod(t).equals(ZERO))
			return ZERO;
		do {
			tries = t.modularNthRoot(n, exp, valueOf(count += bl));
			if (tries == null)
				return null;
		} while (tries.equals(ZERO) /* || !(tries.modPow(exp, this).subtract(n)).mod(this).equals(ZERO) */);
		return tries;
	}

	private BigNumber modularNthRoot(BigNumber n, BigNumber exp, BigNumber z) {
		BigNumber p = this;
		BigNumber p1 = p.subtract(ONE);
		n = n.mod(p);
		exp = exp.mod(p1);
		if (exp.signum() != 1)
			throw new ArithmeticException("exp must be positive");
		if (!p.isProbablePrime(10) || p.mod(TWO).equals(ZERO))
			throw new ArithmeticException("p must be an odd prime.");
		if (exp.gcd(p1).equals(ONE))
			return n.modPow(exp.modInverse(p1), p);
		if (!n.modPow(p1.divide(exp), p).equals(ONE))
			return null;
		BigNumber r = exp.gcd(p1);
		int s = 0;
		do
			z = z.add(ONE);
		while (z.modPow(p1.divide(r), p).equals(ONE));
		do {
			p1 = p1.divide(r);
			s++;
		} while (p1.mod(r).equals(ZERO));
		BigNumber q = p1;
		int m = s;
		BigNumber c = z.modPow(q, p);
		BigNumber t = n.modPow(q, p);
		BigNumber e = n.modPow(r.modInverse(q), p);
		BigNumber msq;
		while (true) {
			if (t.equals(ONE)) {
				msq = e;
				break;
			}
			int i = 0;
			BigNumber l = t;
			do {
				l = l.modPow(r, p);
				i++;
				if (i >= m)
					return ZERO;
			} while (!l.equals(ONE));
			BigNumber b = c.modPow(r.pow(m - i - 1), p);
			m = i;
			c = (b.modPow(r, p)).mod(p);
			t = (t.multiply(b.modPow(r, p))).mod(p);
			e = (e.multiply(b)).mod(p);
		}
		BigNumber res = msq.modPow(r.divide(exp).modInverse(p1), p);
		return res;
	}

	/**
	 * Solves the equation {@code x}<sup>{@code r}</sup> = {@code n mod(p)}, where p
	 * and r are prime numbers. This is similar to the
	 * {@link #modularNthRoot(BigNumber, BigNumber)} method, except it utilizes a
	 * different algorithm, adapted for when the exponent is prime, and improving
	 * efficiency.
	 * 
	 * @param n
	 * @param r
	 * @param p
	 * @return
	 */
	public BigNumber nthRootModuloPrime(BigNumber r, BigNumber p) {
		if (!p.isProbablePrime(10) || p.equals(TWO))
			throw new ArithmeticException("Modulus must be an odd prime.");
		if (this.equals(ZERO) || this.equals(ONE))
			return this;
		return this.nthRootModuloPrime0(r, p);
	}

//	private Stack<BigNumber> factor() {
//		Stack<BigNumber> res = new Stack<BigNumber>();
//		BigNumber c = this;
//		for (BigNumber i = TWO; i.compareTo(this.sqrt()) == -1; i = i.add(ONE)) {
//			if (c.mod(i).equals(ZERO)) {
//				res.add(i);
//				c = c.divide(i);
//			}
//			if (c.isProbablePrime(10)) {
//				res.add(c);
//				break;
//			}
//		}
//		return res;
//	}

	BigNumber nthRootModuloPrime0(BigNumber r, BigNumber p) {
		BigNumber n = this;
		BigNumber p1 = p.subtract(ONE);
		BigNumber z = r;
		n = n.mod(p);
		r = r.mod(p1);
		BigNumber gcd = r.gcd(p1);
		int count = 0;
		if (!gcd.equals(ONE))
			do {
				z = z.divide(gcd);
				count++;
			} while (z.mod(gcd).equals(ZERO));
		BigNumber res = n;
		BigNumber q = z;
		for (int i = 0; i < count; i++)
			res = res.nthRootPrime(gcd, p);
		BigNumber g;
		do {
			g = q.gcd(p1);
			if (res == null)
				return null;
			res = res.nthRootPrime(g, p);
			q = q.divide(g);
		} while (q.gcd(p1).compareTo(ONE) == 1);
		res = res.modPow(q.modInverse(p1), p);
		return res;
	}

	private BigNumber nthRootPrime(BigNumber r, BigNumber p) {
		if (r.equals(ZERO) && this.equals(ONE))
			return ONE;
		else if (r.equals(ZERO))
			return null;
		BigNumber n = this;
		BigNumber d;
		BigNumber l = ONE;
		BigNumber p1 = p.subtract(ONE);
		BigNumber exp = p1.divide(r);
		BigNumber gcd = r.gcd(p1);
		n = n.mod(p);
		r = r.mod(p1);
		if (gcd.equals(ONE))
			return n.modPow(r.modInverse(p1), p);
		if (!n.modPow(exp, p).equals(ONE))
			return null;
		BigNumber q = p1;
		int k = 0;
		do {
			q = q.divide(r);
			k++;
		} while (q.mod(r).equals(ZERO));
		while (true) {
			BigNumber i = n.modPow(q, p);
			int j = 0;
			while (!i.equals(ONE)) {
				i = i.modPow(r, p);
				j++;
			}
			if (valueOf(j).equals(ZERO)) {
				d = (n.modPow(r.modInverse(q), p));
				return (d.multiply(l.modInverse(p))).mod(p);
			}
			BigNumber g = TWO;
			BigNumber sqrt;
			do {
				g = g.add(ONE);
				sqrt = g.modPow(exp, p);
			} while (sqrt.equals(ONE));
			BigNumber z = r.modPow(valueOf(k - j - 1), p1);
			n = (n.multiply(g.modPow(z.multiply(r), p))).mod(p);
			l = (l.multiply(g.modPow(z, p))).mod(p);
		}
	}

	/**
	 * This function performs Hensel Lifting of polynomial equations modulo a prime
	 * power. Given the equation f(x) = a<sub>0</sub> + a<sub>1</sub>x +
	 * a<sub>2</sub>x<sup>2</sup> + .... + a<sub>i</sub>x<sup>i</sup> = 0 mod(p),
	 * where p is a prime number, x, and a positive integer k, this function
	 * "raises" the value of x successively to x<sub>k</sub> , such that
	 * f(x<sub>k</sub>) = 0 mod(p<sup>k</sup>).
	 * 
	 * @param stack, the {@code Stack} containing the polynomial.
	 * @param inp,   the {@code BigNumber} root of the polynomial {@code stack};
	 * @param k,     a {@code int}.
	 * @return "Lifts" the polynomial equation to a certain power modulo a prime
	 *         number.
	 */
	public BigNumber liftingLemma(Stack<BigNumber> stack, BigNumber inp, int k) {
		BigNumber prime = this;
		if (stack.size() < 2)
			throw new ArithmeticException("Stack size must be at least 2");
		if (k < 1)
			throw new ArithmeticException("Power must be prime.");
		if (!prime.isProbablePrime(10) || prime.equals(TWO))
			throw new ArithmeticException("Modulus must be an odd prime.");
		if (!inp.evaluateExpression(stack).mod(prime).equals(ZERO))
			throw new ArithmeticException("Equation modulo prime must be equal to zero");
//		BigNumber rem = inp.evaluateExpression(stack).mod(prime);
//		stack.insertElementAt(stack.get(0).subtract(rem), 1);
//		stack.remove(0);
		BigNumber result = inp;
		Stack<BigNumber> stack1 = computeDerivative(stack);
		BigNumber inp1 = inp.evaluateExpression(stack1);
		for (int i = 1; i < k; i++) {
			BigNumber modulus = prime.pow(i + 1);
			result = (result.subtract(result.evaluateExpression(stack).multiply(inp1.modInverse(modulus))))
					.mod(modulus);
		}
		return result;
	}

	protected static Stack<BigNumber> computeDerivative(Stack<BigNumber> stack) {
		Stack<BigNumber> stackres = new Stack<BigNumber>();
		for (int i = 0; i < stack.size(); i++) {
			BigNumber r = (stack.get(i)).multiply(valueOf(i));
			stackres.add(r);
		}
		stackres.removeElementAt(0);
		return stackres;
	}

	/**
	 * Assume we have a {@code Stack} containing {@code BigNumber} elements.
	 * {@code [e}<sub>0</sub>{@code , e}<sub>1</sub>{@code , e}<sub>2</sub>{@code , ....,e}<sub>i</sub>{@code ]}.
	 * Let {@code n} be a {@code BigNumber}. Then this method returns
	 * {@code e}<sub>0</sub>{@code  + e}<sub>1</sub>{@code n + e}<sub>2</sub>{@code n}<sup>2</sup>{@code + ..... + e}<sub>i</sub>{@code n}<sup>i</sup>.
	 * 
	 * @param stack , the stack containing the element and its place in the
	 *              polynomial.
	 * @return
	 */

	public BigNumber evaluateExpression(Stack<BigNumber> stack) {
		Stack<BigNumber> s1 = stack;
		BigNumber b = this;
		int size = s1.size();
		BigNumber sum = s1.pop();
		for (int i = 1; i < size; i++)
			sum = (sum.multiply(b)).add(s1.pop());
		return sum;
	}

	/**
	 * Evaluates the Pell equation {@code x}<sup>2</sup>{@code - ny}<sup>2</sup> =
	 * {@code 1}.
	 * 
	 * @param i
	 * @return An array containing the non-trivial solutions {@code [ x , y ]}, such
	 *         that {@code x}<sup>2</sup>{@code - ny}<sup>2</sup> = {@code 1}.
	 */
	public static BigNumber[] solvePellEquation(int i) {
		return solvePellEquation(valueOf(i));
	}

	static BigNumber[] solvePellEquation(BigNumber n) {
		if (n.signum() == -1)
			throw new ArithmeticException("N must be positive.");
		if (n.sqrtAndRemainder()[1].equals(ZERO))
			return new BigNumber[] { ONE, ZERO };
		// BigNumber maxVal = n;
		BigNumber a = n.sqrt().add(ONE);
		BigNumber b = ONE;
		BigNumber k = a.pow(2).subtract(n);
		while (!a.gcd(k).equals(ONE)) {
			a = a.add(ONE);
			b = ONE;
			k = a.pow(2).subtract(n);
		}
		while (!k.equals(ONE)) {
			if (k.signum() == 1) {
				BigNumber[] ar = k.sqrtAndRemainder();
				if (ar[1].equals(ZERO)) {
					BigNumber[] zz = a.divideAndRemainder(ar[0]);
					BigNumber[] tt = b.divideAndRemainder(ar[0]);
					if (zz[1].equals(ZERO) && tt[1].equals(ZERO))
						return new BigNumber[] { zz[0], tt[0] };
				}
			}

			BigNumber abs = k.abs();
			BigNumber m = ((b.modInverse(abs)).multiply(a.multiply(NEGATIVE_ONE))).mod(abs);
			m = m.add((abs).multiply((n.sqrt().subtract(m)).divide(abs)));
			BigNumber a1 = (a.multiply(m).add(b.multiply(n))).divide(abs);
			BigNumber b1 = (a.add(b.multiply(m))).divide(abs);
			BigNumber k1 = (m.pow(2).subtract(n)).divide(k);
			a = a1;
			b = b1;
			k = k1;
//			if (k.abs().compareTo(maxVal) == -1) {
//				maxVal = k.abs();
//				System.out.println(maxVal);
//			}
		}
		return new BigNumber[] { a, b };
	}

	/**
	 * Suppose we hae the generalized Pell equation {@code x}<sup>2</sup>
	 * {@code + n(y}<sup>2</sup>{@code ) = p} , where {@code p }is an odd prime
	 * number, and n is a positive not perfect square number less than {@code p}.
	 * Try to find integers {@code x, y}, that fit the above equation, when given
	 * {@code n}, and {@code p}. Using a naive method, checking for all possible
	 * values will not produce a solution in some cases, running indefinitely. To
	 * solve this, ingenious methods must be used, such as continued fractions, or a
	 * cyclic algorithm. This function solves the Pell equation, using the cyclic
	 * algorithm, with a running time of {@code O(n log(p))}.
	 * 
	 * @param i,     or n, not a perfect square.
	 * @param {@code this}, an odd prime number, greater than i.
	 * @return A {@code BigNumber} array, contining two integers {@code [x , y]},
	 *         such that {@code x}<sup>2</sup>{@code + n(y}<sup>2</sup>{@code ) = p}
	 *         , or {@code null} if no solutions exist.
	 * 
	 * @throws ArithmeticException if any of these conditions occour. 1. P is not an
	 *                             odd prime. 2. I must be of the type {@code int},
	 *                             not a perfect square, and positive. 3. I must be
	 *                             less than p.
	 */

	public BigNumber[] solveGeneralizedPellEquation(int i) {
		BigNumber p = this;
		BigNumber i0 = valueOf(i);
		if (!p.isProbablePrime(10))
			throw new ArithmeticException("p must be a positive odd prime.");
		if (i0.sqrtAndRemainder()[1].equals(ZERO) || i0.signum() == -1 || i > INT_MAX_VALUE)
			throw new ArithmeticException(
					"i must not be a perfect square, and it must be positive, less than 2147483647.");
		if (i0.compareTo(p) != -1)
			throw new ArithmeticException("i must be less than p.");
		if (!i0.jacobiSymbol(p))
			return null;
		BigNumber msq = i0.modularSquareRoot(p);
		msq = msq.min(p.subtract(msq));
		BigNumber k = (msq.pow(2).subtract(i0)).divide(p);
		if (k.equals(ONE))
			return new BigNumber[] { msq, ONE };
		return cyclic(i0, msq, ONE, k, p);
	}

	private static BigNumber[] cyclic(BigNumber n, BigNumber a, BigNumber b, BigNumber k, BigNumber code) {
		Stack<BigNumber> stack = new Stack<BigNumber>();
		int count = 1;
		int q = n.sqrt().intValueExact() + 10;
		while (!k.equals(ONE)) {
			if (count % q == 0) {
				int size = stack.size();
				BigNumber s1 = stack.get(size - 1);
				BigNumber s2 = stack.get(size - 2);
				BigNumber s3 = stack.get(size - 3);
				for (int i = stack.size() - 4; i > 4; i--)
					if (stack.get(i).equals(s1) && stack.get(i - 1).equals(s2) && stack.get(i - 2).equals(s3))
						return null;
			}
			BigNumber abs = k.abs();
			BigNumber m = ((b.modInverse(abs)).multiply(a.multiply(NEGATIVE_ONE))).mod(abs);
			m = m.add((abs).multiply((n.sqrt().subtract(m)).divide(abs)));
			BigNumber a1 = (a.multiply(m).add(b.multiply(n))).divide(abs);
			BigNumber b1 = (a.add(b.multiply(m))).divide(abs);
			BigNumber k1 = (m.pow(2).subtract(n)).divide(k);
			a = a1;
			b = b1;
			k = k1;
			count++;
			stack.push(k);
		}
		return new BigNumber[] { a, b };
	}

	/**
	 * Returns whether any solutions exist to the exponential equation in finite
	 * fields. In other words, it determines whether any solutions exist to the
	 * equation {@code x}<sup>{@code r}</sup> {@code = this mod(p)}, where {@code p}
	 * is a prime number, and r is a positive whole number.
	 * 
	 * @param r the exponent, positive.
	 * @param p the modulus, must be an odd prime.
	 * @return a {@code boolean} which determines whether any solutions exist to the
	 *         equation {@code x}<sup>{@code r}</sup> {@code = this mod(p)}.
	 * @throws ArithmeticException if the power is not greater than one, of p is not
	 *                             an odd prime.
	 */

	public boolean deterministicJacobiSymbol(BigNumber r, BigNumber p) {
		BigNumber p1 = p.subtract(ONE);
		if (r.compareTo(ONE) != 1)
			throw new ArithmeticException("Power must be greater than one.");
		if (!p.isProbablePrime(10) || p.mod(TWO).equals(ZERO))
			throw new ArithmeticException("P must be an odd prime.");
		BigNumber gcd = r.gcd(p1);
		if (!gcd.equals(ONE))
			return this.modPow(p1.divide(gcd), p).equals(ONE);
		return true;
	}

	/**
	 * Returns {@code true} iff (if and only if) integer solutions,x, y and z exist
	 * to the quadratic multivariate diophantine equation
	 * {@code a(x}<sup>2</sup>{@code ) + b(y}
	 * <sup>2</sup>{@code ) + c(z}<sup>2</sup>{@code ) = 0}. Otherwise, it returns
	 * {@code false}.
	 * 
	 * @param p1 or a
	 * @param p2 or b
	 * @param p3 or c
	 * @return a {@code boolean} , {@code true, }or {@code false}, whether any
	 *         integer solutions {@code x, y, z} exist to the specified equation
	 *         above.
	 * @throws ArithmeticException if p1, p2, or p3 is not prime.
	 */
	public static boolean doSolutionsExist(BigNumber p1, BigNumber p2, BigNumber p3) {
		BigNumber p1a = p1.abs();
		BigNumber p2a = p2.abs();
		BigNumber p3a = p3.abs();
		if (!p1a.isProbablePrime(10) || !p2a.isProbablePrime(10) || !p3a.isProbablePrime(10))
			throw new ArithmeticException("All elements of the equation must be prime, positive or negative.");
		if (p1.signum() == p2.signum() && p2.signum() == p3.signum() && p3.signum() == p1.signum())
			return false;
		BigNumber a1 = (p2.multiply(p3).multiply(NEGATIVE_ONE));
		BigNumber b1 = (p3.multiply(p1).multiply(NEGATIVE_ONE));
		BigNumber c1 = (p1.multiply(p2).multiply(NEGATIVE_ONE));
		if (a1.jacobiSymbol(p1a) && b1.jacobiSymbol(p2a) && c1.jacobiSymbol(p3a))
			return true;
		return false;
	}

	/**
	 * Returna a {@code boolean} whether any integer solutions exist to the
	 * generalized Pell equation:
	 * {@code x}<sup>{@code 2}</sup>{@code - p}<sub>1</sub>{@code y}<sup>{@code 2}</sup>{@code  = p}<sub>2</sub>,
	 * where {@code p}<sub>1</sub> and {@code p}<sub>2</sub> are prime numebrs.
	 * 
	 * @param p2
	 * @return
	 */
	// FIXME
	public boolean doSolutionsExist(BigNumber p2) {
		if (!this.isProbablePrime(10) || !p2.isProbablePrime(10))
			throw new ArithmeticException("Both parameters must be prime.");
		if (this.jacobiSymbol(p2) && p2.jacobiSymbol(this))
			return true;
		return false;
	}

	/**
	 * Returns the solution to the Josephus problem.In computer science and
	 * mathematics, the Josephus problem (or Josephus permutation) is a theoretical
	 * problem related to a certain counting-out game. People are standing in a
	 * circle waiting to be executed. Counting begins at a specified point in the
	 * circle and proceeds around the circle in a specified direction. After a
	 * specified number of people are skipped,in this case, 2, the next person is
	 * executed. The procedure is repeated with the remaining people, starting with
	 * the next person, going in the same direction and skipping the same number of
	 * people, until only one person remains, and is freed.
	 * 
	 * The problem � given the number of people, starting point, and direction, is
	 * to choose the position in the initial circle to avoid execution.
	 * 
	 * 
	 */
	public BigNumber josephusProblem() {
		return TWO.multiply(this.subtract(TWO.shiftLeft(this.bitLength() - 2))).add(ONE);
	}

	/**
	 * Returns the N'th Metallic mean in the given finite field
	 * F<sub>p<sup>r</sup></sub>. The metallic means (also ratios or constants) of
	 * the successive natural numbers are the continued fractions: de prime"); if (r
	 * < 1||r>INT_MAX_VALUE) throw new ArithmeticException("Exponent must be between
	 * 1 and 2147483647."); BigNumber b =
	 * (this.pow(2).add(FOUR)).modularSquareRoot(p, r); BigNumber pr = p.pow(r); if
	 * (b == null) return null; else return
	 * ((this.add(b)).multiply((pr.add(ONE)).divide(TWO))).mod(pr); }
	 * 
	 * /** Given the equation {@code axy + bx + cy + d = 0 }, the goal in this case
	 * is to find integers, x, and y, that satisfy this equation, or if none exist,
	 * output "None".
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 * @return Integers x and y, such that {@code axy + bx + cy + d = 0 }, or
	 *         {@code null} if none exist.
	 * @throws ArithmeticException if a, b, c, or d are larger than 2147483647
	 * 
	 */

	public static long[] solveEquation(int a, int b, int c, int d) {
		if (a > INT_MAX_VALUE || b > INT_MAX_VALUE || c > INT_MAX_VALUE || d > INT_MAX_VALUE)
			throw new ArithmeticException("All parameters must be less than 2147483647.");
		int n = b * c - a * d;
		long sqrt = (long) Math.sqrt(n);
		for (long i = 1; i <= sqrt; i++) {
			if (n % i == 0) {
				long l1 = i;
				long l2 = n / i;
				long l3 = -l1;
				long l4 = -l2;
				if ((l1 - c) % a == 0)
					if ((n / l1 - b) % a == 0)
						return new long[] { (l1 - c) / a, (n / l1 - b) / a };
				if ((l2 - c) % a == 0)
					if ((n / l2 - b) % a == 0)
						return new long[] { (l2 - c) / a, (n / l2 - b) / a };
				if ((l3 - c) % a == 0)
					if ((n / l3 - b) % a == 0)
						return new long[] { (l3 - c) / a, (n / l3 - b) / a };
				if ((l4 - c) % a == 0)
					if ((n / l4 - b) % a == 0)
						return new long[] { (l4 - c) / a, (n / l4 - b) / a };
			}
		}
		return null;
	}

	/**
	 * Returns the discriminant of the binary quadratic form
	 * {@code ax}<sup>2</sup>{@code  + bxy + cy }<sup>2</sup>{@code = p .}
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return The discriminant of the binary quadratic form
	 *         {@code ax}<sup>2</sup>{@code  + bxy + cy }<sup>2</sup>{@code = p .}
	 */

	public static BigNumber getDiscriminant(BigNumber a, BigNumber b, BigNumber c) {
		return b.pow(2).subtract(FOUR.multiply(a).multiply(c));
	}

	/**
	 * Returns the content of the binary quadratic form
	 * {@code ax}<sup>2</sup>{@code  + bxy + cy }<sup>2</sup>{@code = p .} The
	 * content of the form is the gcd of {@code a, b, c}.
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return The content of the binary quadratic form.
	 */

	public static BigNumber getContent(BigNumber a, BigNumber b, BigNumber c) {
		return (a.abs().gcd(b.abs())).gcd(c.abs());
	}

	public static String getMethodsUsed(BigNumber a, BigNumber b, BigNumber c) {
		if (getDiscriminant(a, b, c).signum() == 1)
			return "Generalized Cyclic Method";
		else
			return "Cornacchia's Algorithm";
	}

	public BigNumber[] solveFactorialEquation() {
		BigNumber n = this;
		if (n.abs().sqrtAndRemainder()[1].equals(ZERO))
			throw new ArithmeticException("Cannot be a perfect square");
		BigNumber p = BigNumber.THREE;
		BigNumber j = n.modPow((p.subtract(ONE)).divide(TWO), p);
		while (!j.equals(p.subtract(ONE))) {
			p = p.nextProbablePrime();
			j = n.modPow((p.subtract(ONE)).divide(TWO), p);
		}
		BigNumber bound = p.subtract(ONE);
		BigNumber prod = ONE;
		for (BigNumber i = ONE; i.compareTo(bound) == -1; i = i.add(ONE)) {
			prod = prod.multiply(i);
			BigNumber guess = prod.add(n);
			BigNumber[] sqrt = guess.sqrtAndRemainder();
			if (sqrt[1].equals(ZERO))
				return new BigNumber[] { i, sqrt[0] };
		}
		return null;
	}

	/**
	 * Returns {@code true}, if {@code this} is a primitive root modulo the sum of
	 * one, and the product of two and the elements in the array, which must be
	 * primes. A primitive root g, modulo a number p, is a number, such that
	 * {@code g}<sup>x</sup> mod {@code p} is distinct for all x between 0 and p-1.
	 * 
	 * 
	 * @param primes, the array containing the prime numbers.
	 * @return Test whether {@code this} is a primitive root mod the prime number.
	 */

	public boolean isPrimitiveRoot(BigNumber[] primes) {
		BigNumber prod = TWO;
		for (BigNumber i : primes) {
			if (!i.isProbablePrime(10))
				throw new ArithmeticException("All elements in array must be prime.");
			else
				prod = prod.multiply(i);
		}
		BigNumber p = prod.add(ONE);
		if (!p.isProbablePrime(10))
			throw new ArithmeticException("Product times two plus one must be prime.");
		if (this.modPow(prod.divide(TWO), p).equals(ONE))
			return false;
		for (BigNumber i : primes)
			if (this.modPow(prod.divide(i), p).equals(ONE))
				return false;
		return true;
	}

	public static BigNumber getLeastPrimitiveRoot(BigNumber[] primes) {
		BigNumber i;
		for (i = ONE; !i.isPrimitiveRoot(primes); i = i.add(ONE))
			;
		return i;
	}

	public BigNumber solveReferentialEquation(BigNumber n) {
		BigNumber p = this;
		if (!p.isProbablePrime(10))
			throw new ArithmeticException("p must be prime");
		BigNumber x = (ONE.subtract(n)).mod(p);
		return n.add(p.multiply(x));
	}

//FIXME
	public static BigNumber[] solveLegendreEquation(BigNumber p1, BigNumber p2, BigNumber p3) {
		if (!p1.isProbablePrime(10) || !p2.isProbablePrime(10) || !p3.isProbablePrime(10))
			throw new ArithmeticException("p1, p2, and p3 must be prime.");
		BigNumber q = ((NEGATIVE_ONE.multiply(p1.modInverse(p3)).multiply(p2)).modularSquareRoot(p3)).mod(p3);
		BigNumber r = ((p1.multiply(p3.modInverse(p2))).modularSquareRoot(p2)).mod(p2);
		BigNumber s = ((p2.multiply(p3.modInverse(p1))).modularSquareRoot(p1)).mod(p1);
		if (q == null || r == null || s == null)
			return null;
		return new BigNumber[] { q, r, s };
	}

	/**
	 * Computes the Kronecker Symbol (m|n), where n does not have to be prime.
	 * However, m and n must be coprime. The Kronecker symbol is defined as: Let
	 * there be two numbers, m and n, both positive and coprime to each other. Then
	 * (m|n) =
	 * 
	 * @param m
	 * @param n
	 * @return
	 */

	public BigNumber computeKroneckerSymbol(BigNumber n) throws StackOverflowError {
		BigNumber m = this;
		if (!n.gcd(m).equals(ONE))
			throw new ArithmeticException("m and n must be coprime.");
		if (m.signum() != 1 || n.signum() != 1)
			throw new ArithmeticException("m and n must both be positive.");
		if (m.equals(EIGHT) && n.equals(NINE))
			return ONE;
		BigNumber res = kroneckerSymbol(m.mod(n), n);
		return res;
	}

	private boolean isPowerOfTwoWithConstratints() {
		// SPECIAL CASE ONLY, FOR NEEDED PURPOSES. ONE IS A POWER OF TWO, ALBEIT 2^0. 0
		// IS NOT A POWER OF TWO;
		if (this.equals(ONE) || this.equals(ZERO))
			return false;
		String s = this.toString(2);
		char[] c = s.toCharArray();
		for (int i = 1; i < c.length; i++)
			if (c[i] != 0)
				return false;
		return true;
	}

	private static BigNumber kroneckerSymbol(BigNumber m, BigNumber n) {
		BigNumber r;
		if (m.equals(ONE))
			return ONE;
		if (n.equals(ONE))
			return ONE;
		if (m.equals(TWO) || m.isPowerOfTwoWithConstratints()) {
			BigNumber i = (n.pow(2).subtract(ONE)).divide(EIGHT);
			if (i.mod(TWO).equals(ONE))
				return NEGATIVE_ONE;
			else
				return ONE;
		}
		if (n.equals(TWO) || n.isPowerOfTwoWithConstratints()) {
			if (m.mod(EIGHT).equals(THREE) || m.mod(EIGHT).equals(FIVE))
				return NEGATIVE_ONE;
			if (m.mod(EIGHT).equals(ONE) || m.mod(EIGHT).equals(SEVEN))
				return ONE;
			else
				return ZERO;
		}
		if (n.isProbablePrime(10))
			return m.evaluateJacobiSymbol(n);
		if (m.compareTo(n) != -1)
			m = m.mod(n);
		BigNumber m0 = m;
		BigNumber n0 = n;
		if (m0.mod(TWO).equals(ONE))
			do
				m0 = m0.divide(TWO);
			while (m0.mod(TWO).equals(ZERO));
		if (n0.mod(TWO).equals(ONE))
			do
				n0 = n0.divide(TWO);
			while (n0.mod(TWO).equals(ZERO));
		BigNumber e = ((m0.subtract(ONE)).divide(TWO)).multiply((n0.subtract(ONE)).divide(TWO));
		if (e.mod(TWO).equals(ZERO))
			r = ONE;
		else
			r = NEGATIVE_ONE;
		BigNumber k = kroneckerSymbol(n, m);
		return r.divide(k);
	}

	/**
	 * Computes the Discrete Logarithm. Implements the Baby Step - Giant Step
	 * algorithm.
	 * 
	 * @param a
	 * @param b
	 * @param m
	 * @return
	 */

	public static BigNumber discreteLogarithm(BigNumber a, BigNumber b, int m) {
		if (m == 0 || m == 1)
			throw new ArithmeticException("Modulus cannot be zero or one.");
		BigNumber mb = valueOf(m);
		BigNumber k0 = ONE;
		a = a.mod(mb);
		b = b.mod(mb);
		BigNumber s = mb.sqrt().add(ONE);
		ArrayList<BigNumber> al = new ArrayList<BigNumber>();
		for (int i = 0; i < s.intValueExact(); i++) {
			al.add(k0);
			k0 = (k0.multiply(a)).mod(mb);
		}
		// BigNumber am = (a.modPow(s, mb)).modInverse(mb);
		BigNumber am = null;
		try {
			am = k0.modInverse(mb);
		} catch (ArithmeticException ax) {
			throw new ArithmeticException("a^ceiling(sqrt(m)) mod m must be coprime to m.");
		}
		BigNumber y = b;
		for (int i = 0; i < s.intValueExact(); i++) {
			int index = al.indexOf(y);
			if (index != -1)
				return (s.multiply(valueOf(i))).add(valueOf(index));
			else
				y = (y.multiply(am)).mod(mb);

		}
		return null;
	}

	/**
	 * Returns {@code false} if the input is definitely composite, otherwise returns
	 * {@code true} if the input is a probable gaussian prime.
	 * 
	 * @param a
	 * @param b
	 * @param certainty
	 * @return a {@code boolean} which is {@code true}, or {@code false} depending
	 *         on the primality of the input.
	 */

	public static boolean isGaussianPrime(BigNumber a, BigNumber b, int certainty) {
		if (b.equals(ZERO)) {
			if (a.isProbablePrime(certainty) && a.mod(FOUR).equals(THREE))
				return true;
			return false;
		}
		if (a.equals(ZERO))
			return false;
		if ((a.pow(2).add(b.pow(2))).isProbablePrime(10))
			return true;
		return false;
	}

	public static BigNumber[] findFittingLine(ArrayList<BigNumber[]> c) {
		ArrayList<BigNumber[]> al = c;
		int l = al.size();
		BigNumber ln = valueOf(l);
		BigNumber xi = ONE;
		BigNumber yi = ONE;
		BigNumber xi2 = ONE;
		BigNumber xiyi = ONE;
		for (int i = 0; i < l; i++) {
			BigNumber[] coordinates = al.get(i);
			int len = coordinates.length;
			if (len != 2)
				throw new IllegalArgumentException(
						"Each element in the given input ArrayList must be an array of size 2. One of the arrays has length "
								+ len);
			BigNumber x = coordinates[0];
			BigNumber y = coordinates[1];
			xi = xi.add(x);
			yi = yi.add(y);
			xi2 = xi2.add(x.multiply(x));
			xiyi = xiyi.add(x.multiply(y));
		}
		BigNumber b = (ln.multiply(xiyi).subtract(xi.multiply(yi))).divide(ln.multiply(xi2).subtract(xi.multiply(xi)));
		BigNumber a = (yi.subtract(b.multiply(xi))).divide(ln);
		return new BigNumber[] { a, b };
	}

	BigNumber leastPrimitiveRoot() {
		if (!this.isProbablePrime(10))
			throw new ArithmeticException("Field must be prime.");
		BigNumber i = BigNumber.TWO;
		for (; !this.isPrimitiveRoot(i); i = i.add(ONE))
			;
		return i;
	}

	boolean isPrimitiveRoot(BigNumber inp) {
		if (!this.isProbablePrime(10))
			throw new ArithmeticException("p must be prime.");
		BigNumber z = this.subtract(ONE);
		ArrayList<BigNumber> g = z.factor(inp.sqrt());
		for (int i = 0; i < g.size(); i++)
			if (inp.modPow(z.divide(g.get(i)), this).equals(ONE))
				return false;
		return true;

	}

	ArrayList<BigNumber> factor(BigNumber bound) {
		ArrayList<BigNumber> result = new ArrayList<BigNumber>();
		BigNumber i = BigNumber.TWO;
		BigNumber k = this;
		while (!k.equals(ONE)) {
			BigNumber res = k.mod(i);
			while (res.equals(ZERO)) {
				k = k.divide(i);
				result.add(i);
				if (k.isProbablePrime(10)) {
					result.add(k);
					break;
				}
				res = k.mod(i);
			}
			i = i.add(ONE);
			if (i.compareTo(bound) == 1)
				break;
		}
		return result;

	}

	// FIXME
	public static BigNumber[] solveMordellCurve(int k) {
		int len = valueOf(k).toString(2).length();
		int len1 = valueOf(len).toString(2).length();
		long numThreads = len * len1;
		long maxBound = k * numThreads;
		long mpow = (long) Math.pow(k, 0.33333333333) + 1;
		for (long i = 0; i < mpow; i++) {
			double msqrt = Math.sqrt((double) (k - i * i * i));
			if (msqrt == (long) msqrt)
				return new BigNumber[] { valueOf((long) msqrt), valueOf(-i) };
		}
		for (long l = 0; l < maxBound; l++) {
			BigNumber i = valueOf(l);
			BigNumber[] msqrt = (i.pow(3).add(valueOf(k))).sqrtAndRemainder();
			if (msqrt[1].equals(ZERO))
				return new BigNumber[] { msqrt[0], i };
		}
		return null;
	}

	public boolean isPrimitveRoot(BigNumber p, int prob) {
		if (!p.isProbablePrime(10))
			throw new ArithmeticException("P must be prime.");
		BigNumber p1 = p.subtract(ONE);
		BigNumber k = p1;
		ArrayList<BigNumber> divisors = k.factor(valueOf(prob));
		factorRes = divisors;
		for (int i = 0; i < divisors.size(); i++) {
			BigNumber t = this.modPow((p1.divide(divisors.get(i))), p);
			if (t.equals(ONE))
				return false;
		}
		return true;
	}

	private static ArrayList<BigNumber> fixList(ArrayList<BigNumber> factors) {
		ArrayList<BigNumber> nf = factors;
		ArrayList<BigNumber> res = new ArrayList<BigNumber>();
		ArrayList<Integer> p = new ArrayList<Integer>();
		for (int i = 0; i < nf.size(); i++) {
			int k = 0;
			BigNumber elem = nf.get(i);
			for (int j = i; j < nf.size(); j++)
				if (nf.get(j).equals(elem))
					k++;
			res.add(elem);
			p.add(k);
		}
		powers = p;
		return res;
	}

	public static boolean discreteLogarithmSolutions(BigNumber g, BigNumber n, BigNumber p, int prob) {
		if (!p.isProbablePrime(10) /* || p.mod(TWO).equals(ONE) */)
			throw new ArithmeticException("Modulus must be an odd prime.");
		g = g.mod(p);
		n = n.mod(p);
		if (n.equals(ONE)) {
			if (g.equals(ZERO))
				return false;
			return true;
		}
		if (g.equals(ONE)) {
			if (n.equals(ONE))
				return true;
			return false;
		}
		if (g.isPrimitveRoot(p, prob))
			return true;
		BigNumber p1 = p.subtract(ONE);
		ArrayList<BigNumber> divisors = factorRes;
		divisors = fixList(divisors);
		for (int i = 0; i < divisors.size(); i++) {
			BigNumber di = divisors.get(i);
			BigNumber d = di;
			for (int j = 1; j <= powers.get(i); j++) {
				BigNumber exp = p1.divide(di/* .pow(j) */);
				BigNumber t = g.modPow(exp, p);
				BigNumber ne = n.modPow(exp, p);
				if (t.equals(ONE) && !ne.equals(t))
					return false;
				di = di.multiply(d);
			}
		}

//		for (int i = 0; i < divisors.size(); i++) {
//			BigNumber di = divisors.get(i);
//			BigNumber exp = p1.divide(di.pow(1));
//			BigNumber t = g.modPow(exp, p);
//			BigNumber ne = n.modPow(exp, p);
//			if (t.equals(ONE) && !ne.equals(t))
//				return false;
//		}
		factorRes = null;
		return true;
	}

	public static boolean discreteLogarithmSolutions(BigNumber g, BigNumber n, BigNumber p) {
		return discreteLogarithmSolutions(g, n, p, p.bitLength() * p.bitLength());
	}

//	public BigNumber[]rationalReconstruction(BigNumber m,BigNumber N){
//		BigNumber v1 = m;
//		BigNumber w1 = this;
//		BigNumber w2 = ONE;
//		while(w1.compareTo(N)==-1) {
//			BigNumber z = v1.mod(w1);
//			v2 = w1;
//			w2 = z;
//		}
//		return new BigNumber[] {w1,w2.abs()};
//	}

	public ArrayList<BigNumber> expansion(BigNumber p) {
		BigNumber n0 = this;
		ArrayList<BigNumber> arr0 = new ArrayList<BigNumber>();
		do {
			BigNumber tmp = (n0.mod(p));
			arr0.add(tmp);
			n0 = (n0.subtract(tmp)).divide(p);
		} while (!n0.equals(BigNumber.ZERO));
		return arr0;
	}
}
