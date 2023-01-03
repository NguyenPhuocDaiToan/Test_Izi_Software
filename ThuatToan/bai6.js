// Bai 6: S = 1/(1x2) + 1/(2x3) + ... + 1/(n x (n+1))

// Cach 1: rut gon: S = 1 - 1/2 + 1/2 - 1/3 + ..... + 1/n - 1/(n+1)
// => S = 1 - 1/(n+1);

let n = 10;
let s = 0;

s = 1 - 1.0/(n + 1);
console.log(s);

// Cach 2: dung vong for
let s1 = 0;
for(let i = 1; i <= n; i++) {
    s1 += 1 / (i * (i + 1));
}
console.log(s1);


// Output: 0.9090909090909091