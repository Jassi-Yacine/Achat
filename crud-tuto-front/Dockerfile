#Stage1
FROM node:current-alpine3.16 as node
WORKDIR /app
COPY . .
RUN npm install
RUN npm run build --prod

#Stage2
FROM nginx:alpine
COPY --from=node /app/dist/crudtuto-Front /usr/share/nginx/html
