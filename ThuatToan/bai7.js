// Bai 7: S = 1/2 + 2/3 + 3/4 + ... + n / (n+1)
let n = 10;
let s = 0;
for(let i = 1; i <= n; i++) {
    s += i / (i + 1);
}
console.log(s);

// Output: 7.980122655122655