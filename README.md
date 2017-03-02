```javascript
Bombarding http://127.0.0.1:8080/persons with 1000000 requests using 100 connections
 1000000 / 1000000 [===============================================================================================================================================================] 100.00% 2m0s
Done!
Statistics        Avg      Stdev        Max
  Reqs/sec      8288.00    2053.49      10447
  Latency       12.06ms    12.25ms   727.47ms
  Latency Distribution
     50%    10.29ms
     75%    12.88ms
     90%    17.39ms
     99%    56.68ms
  HTTP codes:
    1xx - 0, 2xx - 1000000, 3xx - 0, 4xx - 0, 5xx - 0
    others - 0
  Throughput:     2.14MB/s
```

```javascript
Bombarding http://127.0.0.1:8080/persons with 1000000 requests using 200 connections
 1000000 / 1000000 [==============================================================================================================================================================] 100.00% 1m51s
Done!
Statistics        Avg      Stdev        Max
  Reqs/sec      9003.00     477.66      10494
  Latency       22.21ms     8.55ms      1.05s
  Latency Distribution
     50%    22.52ms
     75%    26.00ms
     90%    30.16ms
     99%    44.25ms
  HTTP codes:
    1xx - 0, 2xx - 1000000, 3xx - 0, 4xx - 0, 5xx - 0
    others - 0
  Throughput:     2.33MB/s
```

```javascript
Bombarding http://127.0.0.1:8080/persons with 1000000 requests using 300 connections
 1000000 / 1000000 [==============================================================================================================================================================] 100.00% 1m52s
Done!
Statistics        Avg      Stdev        Max
  Reqs/sec      8872.00     487.40      10786
  Latency       33.80ms    12.44ms      1.06s
  Latency Distribution
     50%    36.48ms
     75%    40.84ms
     90%    46.04ms
     99%    63.25ms
  HTTP codes:
    1xx - 0, 2xx - 1000000, 3xx - 0, 4xx - 0, 5xx - 0
    others - 0
  Throughput:     2.29MB/s
```

```javascript
Bombarding http://127.0.0.1:8080/persons with 1000000 requests using 400 connections
 1000000 / 1000000 [==============================================================================================================================================================] 100.00% 1m54s
Done!
Statistics        Avg      Stdev        Max
  Reqs/sec      8789.00     693.28      10448
  Latency       45.52ms    20.47ms      1.33s
  Latency Distribution
     50%    50.74ms
     75%    55.73ms
     90%    61.69ms
     99%    79.47ms
  HTTP codes:
    1xx - 0, 2xx - 1000000, 3xx - 0, 4xx - 0, 5xx - 0
    others - 0
  Throughput:     2.27MB/s
```

```javascript
Bombarding http://127.0.0.1:8080/persons with 1000000 requests using 500 connections
 1000000 / 1000000 [==============================================================================================================================================================] 100.00% 1m53s
Done!
Statistics        Avg      Stdev        Max
  Reqs/sec      8855.00     522.46      10849
  Latency       56.44ms    25.21ms      1.29s
  Latency Distribution
     50%    64.77ms
     75%    70.02ms
     90%    76.22ms
     99%    93.69ms
  HTTP codes:
    1xx - 0, 2xx - 1000000, 3xx - 0, 4xx - 0, 5xx - 0
    others - 0
  Throughput:     2.29MB/s
```

```javascript
Bombarding http://127.0.0.1:8080/persons with 1000000 requests using 600 connections
 1000000 / 1000000 [==============================================================================================================================================================] 100.00% 2m21s
Done!
Statistics        Avg      Stdev        Max
  Reqs/sec      7073.00    1011.98       9797
  Latency       84.64ms    64.55ms      1.32s
  Latency Distribution
     50%    87.89ms
     75%   109.29ms
     90%   136.19ms
     99%   294.78ms
  HTTP codes:
    1xx - 0, 2xx - 976860, 3xx - 0, 4xx - 0, 5xx - 23140
    others - 0
  Throughput:     1.89MB/s
```

```javascript
Bombarding http://127.0.0.1:8080/persons with 1000000 requests using 700 connections
 1000000 / 1000000 [==============================================================================================================================================================] 100.00% 2m20s
Done!
Statistics        Avg      Stdev        Max
  Reqs/sec      7103.00    1434.57      12170
  Latency       98.48ms   133.05ms      1.98s
  Latency Distribution
     50%    86.52ms
     75%   106.69ms
     90%   139.70ms
     99%   817.95ms
  HTTP codes:
    1xx - 0, 2xx - 976104, 3xx - 0, 4xx - 0, 5xx - 23893
    others - 3
  Errors:
    read tcp4 127.0.0.1:44742->127.0.0.1:8080: i/o timeout - 1
    read tcp4 127.0.0.1:33902->127.0.0.1:8080: i/o timeout - 1
    read tcp4 127.0.0.1:40010->127.0.0.1:8080: i/o timeout - 1
  Throughput:     1.89MB/s
```

```javascript
Bombarding http://127.0.0.1:8080/persons with 1000000 requests using 800 connections
 1000000 / 1000000 [==============================================================================================================================================================] 100.00% 3m20s
Done!
Statistics        Avg      Stdev        Max
  Reqs/sec      4993.00    3394.59      12440
  Latency      160.16ms   188.73ms      1.97s
  Latency Distribution
     50%    95.76ms
     75%   169.48ms
     90%   379.07ms
     99%      1.04s
  HTTP codes:
    1xx - 0, 2xx - 955577, 3xx - 0, 4xx - 0, 5xx - 44423
    others - 0
  Throughput:     1.37MB/s
```

```javascript
Bombarding http://127.0.0.1:8080/persons with 1000000 requests using 900 connections
 1000000 / 1000000 [==============================================================================================================================================================] 100.00% 3m38s
Done!
Statistics        Avg      Stdev        Max
  Reqs/sec      4566.00    3737.51      12923
  Latency      196.81ms   209.96ms      1.99s
  Latency Distribution
     50%   104.35ms
     75%   299.63ms
     90%   446.13ms
     99%      1.04s
  HTTP codes:
    1xx - 0, 2xx - 947810, 3xx - 0, 4xx - 0, 5xx - 52190
    others - 0
  Throughput:     1.26MB/s
```

```javascript
Bombarding http://127.0.0.1:8080/persons with 1000000 requests using 1000 connections
 1000000 / 1000000 [===============================================================================================================================================================] 100.00% 4m2s
Done!
Statistics        Avg      Stdev        Max
  Reqs/sec      4118.00    3816.53      12109
  Latency      242.59ms   241.88ms      2.00s
  Latency Distribution
     50%   121.58ms
     75%   388.04ms
     90%   507.62ms
     99%      1.09s
  HTTP codes:
    1xx - 0, 2xx - 939353, 3xx - 0, 4xx - 0, 5xx - 60647
    others - 0
  Throughput:     1.15MB/s
```
