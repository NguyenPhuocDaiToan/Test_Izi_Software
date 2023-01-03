// Bai 11: S = 1 + 1.2 + 1.2.3 + ... + 1.2.3...N
let n = 10;
let s = 1;
for(let i = 2; i <= n; i++) {
    s += s * i;
}
console.log(s);
// output: 19958400