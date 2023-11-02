# LZ77 Compression

## Overview

LZ77 is a widely used data compression algorithm that utilizes a sliding window and dictionary-based approach to compress data. This README provides an introduction to LZ77 compression, its principles, and its usage.

## Table of Contents

1. [Introduction](#introduction)
2. [Principles](#principles)

## Introduction

LZ77 is a lossless data compression algorithm developed by Abraham Lempel and Jacob Ziv in 1977. It forms the basis of many compression algorithms and is a fundamental technique in data compression.

The LZ77 algorithm works by replacing repeating sequences of characters with references to previous occurrences. This is achieved by maintaining a sliding window and a dictionary of previously encountered data. The compression ratio achieved by LZ77 depends on the characteristics of the input data.

## Principles

LZ77 compression is based on the following key principles:

- **Sliding Window:** LZ77 maintains a sliding window of a fixed size that moves through the input data. This window includes both the current data and a history of previously processed data.

- **Dictionary:** Within the sliding window, LZ77 maintains a dictionary that stores sequences of data that have been seen before. The dictionary is used to identify repeating patterns.

- **Matching and Encoding:** As the sliding window advances, LZ77 searches for the longest match between the current data and the dictionary. When a match is found, it encodes the match as a pair (distance, length). The distance represents how far back in the dictionary the match begins, and the length is the number of characters in the match.

- **Output Format:** The compressed data is represented as a stream of (distance, length, next_character) triples. When no match is found, a (0, 0, character) triple is used to represent a single character from the input data.

- **Decompression:** LZ77 compression is reversible, meaning the original data can be reconstructed from the compressed data using the (distance, length, next_character) triples.
