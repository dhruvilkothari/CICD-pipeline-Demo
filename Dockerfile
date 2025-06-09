FROM ubuntu:latest
LABEL authors="kothari"

ENTRYPOINT ["top", "-b"]