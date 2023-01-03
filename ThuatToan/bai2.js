// Bai 2: S = 1^2 + 2^2 + ... + n^2
// Dùng công thức: S = n * (n + 1) * (2n + 1) / 6

let n = 10;
let sum = n * (n + 1) * (2*n + 1) / 6;
console.log(sum);

let sum1 = 0;
for(let i = 1; i <= n; i++) {
    sum1 += i * i;
}
console.log(sum1);

// Output: 385