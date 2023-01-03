// Bai4: S = 1/2 + 1/4 + ... + 1/2n

let n = 10;
let sum = 0;
for(let i = 1; i <= n; i++) {
    sum += 1.0 / (2 * i);
}

console.log(sum);

// Output: 1.4644841269841269