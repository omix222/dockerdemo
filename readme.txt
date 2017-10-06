Mac環境での実行例

Docker Quickstart Terminalを起動する。これによりDockerホストが起動される。
同じターミナルから、本プロジェクトにcd

ビルド＆Dockerファイルの作成
mvn  dockerfile:build

#Dockerイメージの登録&実行(--rm オプションで停止時にイメージ削除)
docker run -it -p 80:8080 --rm --name dockerspringdemo springio/dockerdemo:latest 

#登録されたものを再実行（上記の--rmオプションを使わないときに利用）
docker run -it -p 80:8080 springio/dockerdemo:latest

ブラウザでアクセスする際は、Dockerターミナルで表示されているIPでのアクセスとなるので注意！
例
http://192.168.99.100/hello

リファレンス

止まっているコンテナも含めて表示: docker ps -a

docker@default:~$ docker ps -a
CONTAINER ID        IMAGE               COMMAND                  CREATED             STATUS                      PORTS                           NAMES
6fc9713647d1        wordpress           "/entrypoint.sh apach"   10 minutes ago      Up 9 minutes                0.0.0.0:8000->80/tcp            wordpress

コンテナの削除: docker rm

docker@default:~$ docker rm ubuntu

停止中のコンテナの全削除: docker rm `docker ps -a -q`