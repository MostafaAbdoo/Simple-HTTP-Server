# Simple HTTP Server (Java)

This is a minimal HTTP server written in plain Java.  
It listens on **port 8080**, prints incoming HTTP requests to the console, and responds with the text **"Mangaoo"**.

---

## How It Works

1. The server opens a `ServerSocket` on port **8080**.  
2. When a client connects (like your browser), it reads the HTTP request line by line.  
3. It prints the request to the console.  
4. It sends back a basic HTTP response and closes the connection.

---
## output
```bash
Listening for connection on port 8080 ....
GET / HTTP/1.1
Host: localhost:8080
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:144.0) Gecko/20100101 Firefox/144.0
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
Accept-Language: en-US,en;q=0.5
Accept-Encoding: gzip, deflate, br, zstd
Connection: keep-alive
Upgrade-Insecure-Requests: 1
Sec-Fetch-Dest: document
Sec-Fetch-Mode: navigate
Sec-Fetch-Site: none
Sec-Fetch-User: ?1
DNT: 1
Sec-GPC: 1
Priority: u=0, i
```
> and your browser will show `mangaoo`

## How to Run

### Requirements
- Java 8 or newer installed.

### Commands
```bash
# Compile
javac SimpleHTTPServer.java

# Run
java SimpleHTTPServer
```
