#Stage 1
FROM node:16.18.0-alpine3.15 as build-stage
WORKDIR /app
COPY ["package.json", "package-lock.json*", "./"]
RUN npm install --legacy-peer-deps
COPY . /app
ARG configuration=production
RUN npm run ng build -- --output-path=dist --configuration=$ENVIROMENT --verbose

# Stage 2
FROM nginx:latest
COPY --from=build-stage /app/dist/out/ /usr/share/nginx/html
# Expose port 80
EXPOSE 80