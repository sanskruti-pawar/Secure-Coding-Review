# Secure-Coding-Review
# 🔐 Java Login System: Secure vs Insecure Authentication

This project demonstrates the difference between **secure** and **insecure** login systems in Java, focusing on how password handling impacts application security.

---

## 📌 About the Project

Authentication is a critical part of any system. This project compares:

- ❌ Storing passwords in plain text (Insecure)
- ✅ Storing hashed passwords using SHA-256 (Secure)

---

## 🚀 Implementations

### 🔒 Secure Login System (`SecureLogin.java`)
- Uses **SHA-256 hashing**
- Prevents password exposure
- Limits login attempts (3 tries)
- Locks account after failures

### ⚠️ Insecure Login System (`InsecureLogin.java`)
- Stores passwords in **plain text**
- No encryption or hashing
- Highly vulnerable to attacks

---

## 🛠️ Technologies Used

- Java
- `java.security.MessageDigest`
- SHA-256 Hashing Algorithm

---

## 📂 Project Structure
