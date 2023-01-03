// Bai 5: 1 + 1/3 + 1/5 + ... + 1/ (2*n - 1)

let n = 10;
let s = 0;
for(let i = 1; i <= n; i++) {
    s += 1.0 / (2 * i - 1);
}
console.log(s);

// Output: 2.1332555301595546