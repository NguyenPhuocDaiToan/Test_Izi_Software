// Bai 10: S = x^n;

let x = 2;
let n = 10;
// Cach 1: Dung for binh thuong
let s = 1;
for(let i = 1; i <= n; i++) {
    s *= x;
}
console.log(s);

// Cach 2: dung chia de tri
function pow_x(x, n) {
    if(n === 1) return x;
    let t = pow_x(x, Number.parseInt(n/2));
    return n % 2 === 0 ? t * t : t * t * x;
}
console.log(pow_x(x, n));

// Cach 3: Dung ham co san
console.log(Math.pow(x, n));

// output: 1024