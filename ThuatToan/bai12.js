// Bai 12: S = x + x^2 + x^3 + ... + x^n

let n = 10; 
let x = 2;
// Cach 1: cth cap so nhan
// => S = u1 * (1 - q^n) / (1 - q);
// => S = x * (1 - x^n) / (1 - x);
// => Chi can tinh x ^ n (Bai 10)

function pow_x(x, n) {
    if(n === 1) return x;
    let t = pow_x(x, Number.parseInt(n/2));
    return n % 2 === 0 ? t * t : t * t * x;
}
let s = x * (1 - pow_x(x, n)) / (1 - x);
console.log(s);

// Cach 2: Dung for bth
let s1 = x;
let t = x;
for(let i = 2; i <= n; i++) {
    t = t * x;
    s1 += t;
}
console.log(s1);

// Output: 2046
