#Stage1
FROM node:latest as nodestage
WORKDIR /app
COPY . .
RUN npm install
RUN npm run build --prod

#Stage2
FROM nginx:alpine
COPY --from=nodestage /app/dist/crudtuto-Front /usr/share/nginx/html
