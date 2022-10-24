#Stage1
FROM node:latest AS node
WORKDIR /app
COPY . .
RUN npm install --force
RUN npm build --prod
#Stage2
FROM nginx:alpine
COPY --from=node /app/dist/crudtuto-Front /usr/share/nginx/html