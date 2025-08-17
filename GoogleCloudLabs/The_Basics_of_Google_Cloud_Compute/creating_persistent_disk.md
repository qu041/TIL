# Creating a Persistent Disk (Qwiklabs Lab)

**출처**: [Creating a Persistent Disk - Skill Badge](https://www.cloudskillsboost.google/course_templates/754/labs/461561)  
**목표**: Google Cloud Compute Engine VM 인스턴스를 만들고, 퍼시스턴트 디스크(Persistent Disk)를 생성·연결·포맷·마운트한다.

---

## Task 1. VM 인스턴스 생성

```bash
gcloud config set compute/region us-west1
gcloud config set compute/zone us-west1-a
export ZONE=us-west1-a

gcloud compute instances create gcelab \
  --zone=$ZONE \
  --machine-type=e2-standard-2
이름: gcelab

머신 타입: e2-standard-2 (2 vCPU, 8 GB RAM)

부트 디스크: 기본 Debian 이미지

결과: VM 생성 후 gcloud compute ssh 접속 성공

Task 2. 퍼시스턴트 디스크 생성 및 연결
디스크 생성 (200GB)

bash
복사
편집
gcloud compute disks create mydisk \
  --size=200GB \
  --zone=$ZONE
디스크 VM에 연결

bash
복사
편집
gcloud compute instances attach-disk gcelab \
  --disk=mydisk \
  --zone=$ZONE
Task 3. VM 내부에서 디스크 포맷 및 마운트
VM 접속

bash
복사
편집
gcloud compute ssh gcelab --zone=$ZONE
마운트 포인트 생성

bash
복사
편집
sudo mkdir /mnt/mydisk
디스크 확인

bash
복사
편집
ls -l /dev/disk/by-id/
# → scsi-0Google_PersistentDisk_persistent-disk-1 확인
디스크 포맷 (ext4)

bash
복사
편집
sudo mkfs.ext4 -F -E lazy_itable_init=0,lazy_journal_init=0,discard \
/dev/disk/by-id/scsi-0Google_PersistentDisk_persistent-disk-1
디스크 마운트

bash
복사
편집
sudo mount -o discard,defaults \
/dev/disk/by-id/scsi-0Google_PersistentDisk_persistent-disk-1 \
/mnt/mydisk
결과: /mnt/mydisk 경로에서 새 디스크 사용 가능

Task 4. 재부팅 시 자동 마운트 설정
bash
복사
편집
sudo nano /etc/fstab
마지막 줄에 추가:

swift
복사
편집
/dev/disk/by-id/scsi-0Google_PersistentDisk_persistent-disk-1 /mnt/mydisk ext4 defaults 1 1
저장: Ctrl+O → Enter → Ctrl+X

배운 점
VM (Virtual Machine): 클라우드에서 실행되는 독립적인 가상 컴퓨터 환경

Persistent Disk: VM과 독립적으로 존재하는 블록 스토리지, 데이터 보존 가능

마운트 과정: 디스크를 파일시스템(ext4)으로 포맷 후 지정 경로(/mnt/mydisk)에 연결

/etc/fstab: 시스템 재부팅 시 자동 마운트 설정 파일

중요 포인트: VM 삭제 시에도 퍼시스턴트 디스크는 유지할 수 있으며(--keep-disks 옵션), 다른 VM에 재사용 가능