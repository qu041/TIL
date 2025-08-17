# Create a Virtual Machine (Qwiklabs Lab)

**출처**: [The Basics of Google Cloud Compute - Skill Badge](https://www.cloudskillsboost.google/course_templates/754/labs/461560)  
**목표**: Google Cloud Console과 gcloud CLI를 사용해 VM 인스턴스를 만들고, NGINX 웹 서버를 배포한다.

---

## Task 1. VM 인스턴스 생성 (콘솔)

- **이름**: `geclab`  
- **머신 타입**: `e2-medium` (2 vCPU, 4 GB RAM)  
- **부트 디스크**: Debian (기본값)  
- **방화벽**: HTTP 트래픽 허용 (Allow HTTP traffic)  
- **결과**: VM 생성 후 SSH 접속 성공

---

## Task 2. NGINX 설치

```bash
sudo apt-get update
sudo apt-get install -y nginx
systemctl status nginx → 실행 상태 확인

curl -I http://localhost → HTTP/1.1 200 OK 확인

VM의 External IP 접속 → "Welcome to nginx!" 페이지 확인

Task 3. gcloud CLI로 VM 생성
bash
복사
편집
gcloud compute instances create gcelab2 \
  --machine-type=e2-medium \
  --zone=us-east4-a
SSH 접속 & NGINX 설치
bash
복사
편집
gcloud compute ssh gcelab2 --zone=us-east4-a
sudo apt-get update
sudo apt-get install -y nginx
gcloud compute instances list → External IP 확인

브라우저에서 http://<gcelab2-EXTERNAL-IP> 접속

→ "Welcome to nginx!" 페이지 확인

배운 점
VM (Virtual Machine): 클라우드에서 제공하는 독립적인 컴퓨터 환경

NGINX: 가볍고 빠른 웹 서버, 설치만으로 기본 웹 페이지 서비스 가능

콘솔 vs gcloud CLI: 두 가지 방법으로 동일한 리소스를 생성/관리할 수 있음

방화벽 규칙 + 태그: 외부 접속 시 반드시 포트 80 허용 필요