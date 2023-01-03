// Bai 1: S(n) = 1 + 2 + 3 + ... + n 
// -> Cấp số cộng: S = n * (n + 1) / 2
let n = 10;
let sum = n * (n + 1) / 2;
console.log(sum);

// Dùng vòng lặp for
let sum1 = 0;
for(let i = 1; i <= n; i++) {
    sum1 += i;
}
console.log(sum1);

// Output: 55 