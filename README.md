https://chatgpt.com/c/677b292d-5570-8005-85e4-45eefee7cf31
Đỗ Hồng Đăng - 22SE1
Mô tả
Viết một chương trình Java gồm lớp BankAccount với các chức năng cơ bản như tạo tài khoản, nạp tiền, rút tiền và kiểm tra số dư. Sau đó, viết các trường hợp kiểm thử (test cases) để kiểm tra hoạt động của lớp này.
Mô tả chi tiết:
1. Lớp BankAccount
Lớp BankAccount mô phỏng một tài khoản ngân hàng với các chức năng cơ bản như nạp tiền, rút tiền và kiểm tra số dư.
![image](https://github.com/user-attachments/assets/9431813c-b400-4274-9ddc-8b9f244a1b1c)
*Phân tích từng phần:
1.1 Khai báo thuộc tính:
accountNumber: Lưu số tài khoản ngân hàng (kiểu chuỗi, để đảm bảo không gặp lỗi nếu số tài khoản chứa ký tự).
balance: Lưu số dư hiện tại của tài khoản (kiểu double để hỗ trợ các giao dịch tiền tệ).
1.2 Hàm khởi tạo:
Input:
accountNumber: Số tài khoản.
initialBalance: Số dư ban đầu.
Tác dụng:
Khởi tạo đối tượng BankAccount với số tài khoản và số dư ban đầu.
1.3 Phương thức deposit:
java:
![image](https://github.com/user-attachments/assets/c736fdb6-45ec-4e66-b66f-d06a0e43c00d)
Input: amount - số tiền cần nạp.
Logic:
Kiểm tra amount có lớn hơn 0 hay không.
Nếu nhỏ hơn hoặc bằng 0, ném ra ngoại lệ IllegalArgumentException.
Nếu hợp lệ, cộng số tiền nạp vào số dư hiện tại.
Output: Không trả về giá trị, chỉ cập nhật số dư.
1.4 Phương thức withdraw:
   ![image](https://github.com/user-attachments/assets/b1af26ce-368c-41d3-b17d-c65df5685128)
Input: amount - số tiền cần rút.
Logic:
Kiểm tra amount lớn hơn 0.
Nếu nhỏ hơn hoặc bằng 0, ném ngoại lệ IllegalArgumentException.
Kiểm tra số tiền rút có lớn hơn số dư không.
Nếu số tiền rút lớn hơn số dư, ném ngoại lệ IllegalArgumentException.
Nếu hợp lệ, trừ số tiền rút khỏi số dư hiện tại.
Output: Không trả về giá trị, chỉ cập nhật số dư.
1.5 Phương thức getBalance:
   ![image](https://github.com/user-attachments/assets/9f626523-b75a-45d5-b562-d84e6c529676)
Tác dụng: Trả về số dư hiện tại của tài khoản.
2. Lớp kiểm thử BankAccountTest
Lớp BankAccountTest dùng để kiểm thử hoạt động của lớp BankAccount bằng JUnit 5.
![image](https://github.com/user-attachments/assets/f1774102-c9e9-48a4-9d4b-83178fe43c56)
Phân tích từng phần:
2.1 Import thư viện JUnit 5:
   ![image](https://github.com/user-attachments/assets/0efc35ca-689b-46ca-a640-d7f9a859dcc7)
2.2 Kiểm tra việc tạo tài khoản (testCreateAccount):
   ![image](https://github.com/user-attachments/assets/7d3e47c6-9e53-48a5-ac05-ffcce3320494)
Tạo tài khoản với số dư ban đầu là 1000.0.
Kiểm tra số dư có đúng bằng 1000.0 không.
2.3 Kiểm tra nạp tiền hợp lệ (testDepositValidAmount):
![image](https://github.com/user-attachments/assets/cc98e2fe-a28b-4999-9ac3-9bd64d0734cc)
Nạp thêm 500.0 vào tài khoản có số dư 1000.0.
Kiểm tra số dư mới là 1500.0.
2.4 Kiểm tra nạp tiền không hợp lệ (testDepositInvalidAmount):
![image](https://github.com/user-attachments/assets/e833b5bf-1500-4d7b-b57f-c5c6882d3773)
Nạp số tiền âm và kiểm tra có ném ngoại lệ IllegalArgumentException.
2.5 Kiểm tra rút tiền hợp lệ (testWithdrawValidAmount):
![image](https://github.com/user-attachments/assets/d1db845a-6549-4f0a-a230-ea4a0bd427a9)
Rút 200.0 từ tài khoản có số dư 1000.0.
Kiểm tra số dư còn lại là 800.0.
2.6 Kiểm tra rút tiền không hợp lệ (testWithdrawInvalidAmount):
![image](https://github.com/user-attachments/assets/7f02a9b5-f877-405b-bcc6-729c85338bf0)
Rút số tiền lớn hơn số dư và kiểm tra ngoại lệ.
3. Kiểm thử phần mềm
Sau khi khởi tạo đoạn mã chạy thử thành công với kết quả như dưới đây:
![image](https://github.com/user-attachments/assets/ca05ea1b-7796-4ebe-ab0e-5354c1353b53)
Tổng kết:
Lớp BankAccount cung cấp các chức năng cơ bản cho tài khoản ngân hàng.
Lớp BankAccountTest kiểm thử đầy đủ các trường hợp sử dụng và ngoại lệ.
Sử dụng JUnit 5 để đảm bảo tính chính xác và đáng tin cậy của mã nguồn. 




