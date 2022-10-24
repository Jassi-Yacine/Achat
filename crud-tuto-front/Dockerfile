#Stage 1
FROM node as build-stage
WORKDIR /app
ADD package*.json /app/
RUN npm install --legacy-peer-deps
ADD ./ /app/
ARG configuration=production
RUN npm run ng build -- --output-path=dist --configuration=$ENVIROMENT --verbose

# Stage 2
FROM nginx:latest
COPY --from=build-stage /app/dist/out/ /usr/share/nginx/html
# Expose port 80
EXPOSE 80