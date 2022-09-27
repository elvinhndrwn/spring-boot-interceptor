# spring-boot-interceptor

Interceptor pada Spring boot biasanya digunakan untuk melakukan operasi:
1. Melakukan perintah sebelum mengirim request ke controller
2. Melakukan perintah sebelum mengirim response dari controller

Untuk menggunakan Interceptor anda harus mengimplementasikan class HandlerInterceptor. HandlerInterceptor  memiliki 3 method utama yaitu:
1. prehandle() – dipanggil sebelum eksekusi handler yang sebenarnya
2. postHandle() – dipanggil setelah handler dieksekusi
3. afterCompletion() - dipanggil setelah permintaan lengkap/selesai dan menampilkan response
